function showResults() {
  var resultsTable = document.getElementById("resultsTable");
  if (resultsTable.style.display === "none") {
    resultsTable.style.display = "table";
  } else {
    resultsTable.style.display = "none";
  }
}

function startCountdown() {
  var targetDate = new Date();
  targetDate.setDate(targetDate.getDate() + 14); 
  var countdownInterval = setInterval(function () {
    var currentDate = new Date().getTime();
    var distance = targetDate - currentDate;

    var weeks = Math.floor(distance / (1000 * 60 * 60 * 24 * 7));
    var days = Math.floor(distance % (1000 * 60 * 60 * 24 * 7) / (1000 * 60 * 60 * 24));
    var hours = Math.floor(distance % (1000 * 60 * 60 * 24) / (1000 * 60 * 60));
    var minutes = Math.floor(distance % (1000 * 60 * 60) / (1000 * 60));
    var seconds = Math.floor(distance % (1000 * 60) / 1000);
    var milliseconds = Math.floor(distance % 1000);

    document.getElementById("countdown").innerHTML = "Countdown: " + weeks + " weeks, " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds, " + milliseconds + " milliseconds";

    if (distance <= 0) {
      clearInterval(countdownInterval);
      document.getElementById("countdown").innerHTML = "EXPIRED";
    }
  }, 1);
}
