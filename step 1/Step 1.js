function getDaysUntilChristmas() {
  
    const currentDate = new Date();
    const currentYear = currentDate.getFullYear();
  
   
    const christmasMonth = 11; 
    const christmasDay = 25;
    const christmasDate = new Date(currentYear, christmasMonth, christmasDay);
    const timeUntilChristmas = christmasDate - currentDate;

    const daysUntilChristmas = Math.ceil(timeUntilChristmas / (1000 * 60 * 60 * 24));

    return daysUntilChristmas;
}

const daysRemaining = getDaysUntilChristmas();

console.log(`Days until Christmas: ${daysRemaining}`);




