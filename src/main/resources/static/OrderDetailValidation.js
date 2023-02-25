

function updateSecondSelection() {
  // Get the value of the first selection
  var firstSelectionValue = document.getElementById("first-selection").value;

  // Loop through the options in the second selection
  var secondSelectionOptions = document.getElementById("second-selection").options;
  for (var i = 0; i < secondSelectionOptions.length; i++) {
    var option = secondSelectionOptions[i];

    // Hide the option if its parent value does not match the first selection value
    if (option.getAttribute("data-parent") !== firstSelectionValue) {
      option.style.display = "none";
    } else {
      option.style.display = "";
    }
  }
}
