if (window.console) {
  console.log("Welcome to your Play application's JavaScript!");
  increaseNumber()
}

async function increaseNumber() {
  //Henter data fra /count siden. Der som eksemplet har laget en counter.
  //https://www.javascripttutorial.net/javascript-fetch-api/
  //Hentet fetch fra denne siden. Tenkte jeg kunne linke til siden.
  let response = await fetch('/count');  // Henter data fra /count siden. Hver gang den blir kjørt så øker tallet med 1.
  let data = await response.text();
  //Console logger det siden da er det mulig å se tallene oppdatere seg i console i nettleseren.
  console.log(data);

  //Endrer på teksen i en p tag på siden oppgaven.scala.html.
  document.getElementById("numberId").innerHTML = data
}
