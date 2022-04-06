if (window.console) {
  console.log("Welcome to your Play application's JavaScript!");
  increaseNumber()
}

async function increaseNumber() {
  //Henter data fra /count siden. Der som eksemplet har laget en counter.
  let response = await fetch('/count');
  let data = await response.text();
  //Console logger det siden da er det mulig å se tallene oppdatere seg i console i nettleseren.
  console.log(data);

  //Endrer på teksen i en p tag på siden increase.scala.html.
  document.getElementById("numberId").innerHTML = data
}
