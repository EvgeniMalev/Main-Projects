document.addEventListener('DOMContentLoaded', function () {
  const movingObject = document.querySelector('.moving-object');
  const images = ['forest1.jpg', 'forest2.jpg', 'forest.jpg']; 
  let currentIndex = 0;

  const imageChangeInterval = setInterval(() => {
    currentIndex = (currentIndex + 1) % images.length;
    movingObject.style.backgroundImage = `url(${images[currentIndex]})`;
  }, 1000); 

  setTimeout(() => {
    clearInterval(imageChangeInterval);
    movingObject.style.display = 'none'; 
  }, 10000);
});
