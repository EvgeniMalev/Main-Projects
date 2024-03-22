document.addEventListener("DOMContentLoaded", function () {
  const calendarContainer = document.querySelector(".calendar");

  function renderCalendar() {
    const currentDay = 21;
    const currentMonth = 2; 
    const currentYear = new Date().getFullYear();

    
    const dayNames = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];

   
    const firstDayOfWeek = new Date(currentYear, currentMonth, currentDay).getDay();

   
    let calendarHTML = `
      <table>
        <tbody id="calendar-body">
          <tr>
            <td colspan="7" class="current-day">${currentDay} March</td>
          </tr>
        </tbody>
      </table>
    `;

   
    calendarContainer.innerHTML = calendarHTML;
  }

  
  function showNextDay(event) {
    const clickedElement = event.target;
    const currentDay = parseInt(clickedElement.textContent);

    
    if (!isNaN(currentDay)) {
      const nextDay = currentDay + 1;
      alert(`Next day: ${nextDay} March`);
    }
  }

  renderCalendar(); 

  calendarContainer.addEventListener("click", showNextDay);
});
