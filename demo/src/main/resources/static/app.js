function searchWeather(){
    const location = document.getElementById("location").value;
    const url = `/services?location=${location}`;

    fetch(url)
        .then(response => response.json())
        .then(data => {
            const resultsDiv = document.getElementById('weather-results');
            resultsDiv.innerHTML = "";

            if(data.length === 0){
                resultsDiv.innerHTML = '<p>No services found for this location.</p>';            
            } else {
                data.forEach(service => {
                    resultsDiv.innerHTML += `<p>Service URL: ${service.serviceUrl}</p>`;
                });
            }
        })
        .catch(error => {
            console.error("Error fetching weather services: ", error);
        })
}