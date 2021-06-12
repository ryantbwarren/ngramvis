# NGramVis: N-gram Fingerprint for Code Clone Visualisation
Supporting material for the [ASE 2021 Tool Demonstrations](https://conf.researchr.org/track/ase-2021/ase-2021-tool-demonstrations) conference submission.

## I. Requirements
- [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

## II. Description
- NGramVis was developed and tested on a device running Windows 10. Further testing on additional operating systems will be required before also confirming as operational.
- Two example projects containing different methods to test code clone identification have been included in the [codeclones](codeclones/) directory.
  1. [projectone](codeclones/projectone)
  2. [projectone](codeclones/projecttwo)

## III. Dependencies
- The list of dependencies can be found [dependencies/README.md](dependencies/README.md)
- The dependencies have been included in the packaged Jar.

## IV. Running
1. Cloning the repository.
    > git clone "https://github.com/ryantbwarren/ngramvis"
2. Running the tool.
    > java -jar ngramvis-bundled.jar 

## V. Usage
### Selecting and Loading Repository A
1. Click `Load Repository A` to open the system directory explorer.
2. Navigate to the root directory of the repository you want to test with.

### Selecting and Loading Repository B
1. Click `Load Repository B` to open the system directory explorer.
2. Navigate to the root directory of the repository you want to test against.
3. N.B. If you wish to visualise inter-project method similarities, please select the same repository as you did for `Load Repository A`.

### Generating Fingerprints
1. Once both Repository A and B have been loaded.
2. Click `Generate Fingerprints`.
3. A collection of fingerprinted method models will be displayed in the left-most table.

### Listing Similar Methods
1. Once both Repository A and B have been loaded and the fingerprints have been generated.
2. Select a row in the left-most table. This will populate the right-most table with methods sorted by their Jaccard Similarity.

### Generating Reports
1. Having selected a row from both tables.
2. Click `Generate Report`.
3. A browser window will be opened displaying the visualisation report.