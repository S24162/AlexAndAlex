document.addEventListener('DOMContentLoaded', function () {
  const burgerButton = document.querySelector('.burger-button');
  const menuOverlay = document.querySelector('.menu-overlay');

  let isMenuOpen = false;

  function toggleMenu() {
    isMenuOpen = !isMenuOpen;

    if (isMenuOpen) {
      menuOverlay.classList.add('active');
    } else {
      menuOverlay.classList.remove('active');
    }
  }

  burgerButton.addEventListener('click', toggleMenu);

  menuOverlay.addEventListener('click', function (e) {
    if (e.target === menuOverlay) {
      toggleMenu();
    }
  });
});

// function calculatePrice() {
//   const inputs = ['a1', 'b1', 'c1', 'a2', 'b2', 'c2', 'a3', 'b3', 'c3'];
//   let total = 0;
//
//   inputs.forEach((id) => {
//     const value = parseFloat(document.getElementById(id)?.value || 0);
//     total += value * 100;
//   });
//
//   const priceResult = document.getElementById('priceResult');
//   if (priceResult) {
//     priceResult.textContent = total.toLocaleString('pl-PL') + ' zł';
//   }
// }

function calculatePrice() {
  // zbieramy dane z inputów
  const data = {
    a1: parseFloat(document.getElementById('a1').value) || 0,
    b1: parseFloat(document.getElementById('b1').value) || 0,
    c1: parseFloat(document.getElementById('c1').value) || 0,
    a2: parseFloat(document.getElementById('a2').value) || 0,
    b2: parseFloat(document.getElementById('b2').value) || 0,
    c2: parseFloat(document.getElementById('c2').value) || 0,
    a3: parseFloat(document.getElementById('a3').value) || 0,
    b3: parseFloat(document.getElementById('b3').value) || 0,
    c3: parseFloat(document.getElementById('c3').value) || 0,
    materialId: parseInt(document.getElementById('materialSelect').value),
    colorId: parseInt(document.getElementById('colorSelect').value),
    mechanismId: parseInt(document.getElementById('mechanismSelect').value)
  };

  // wysyłamy do backendu
  fetch('/price', {
    method: 'POST',
    headers: {'Content-Type': 'application/json'},
    body: JSON.stringify(data)
  })
      .then(response => response.json())
      .then(result => {
        // wstawiamy cenę do pola w HTML
        const priceResult = document.getElementById('priceResult');
        if (priceResult) {
          priceResult.textContent = result.price.toLocaleString('pl-PL') + ' zł';
        }
      })
      .catch(error => {
        console.error('Błąd przy obliczaniu ceny:', error);
      });
}
