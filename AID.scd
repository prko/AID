/*
For class names, method names, documentation titles, and summaries,
.aid works in the same manner as .help.
*/

// Classes:
"Quark".aid;
"Quark".help;

// Methods:
"help".aid;
"help".help;

// Titles:
"Using Quarks".aid;
"Using Quarks".help;

// Summaries:
"Object for managing a Quark - a package of source code".aid;
"Object for managing a Quark - a package of source code".help;


/*
Online documentation and local documentation files, such as SCD, HTM,
and HTML files, can also be accessed.
*/

// Online documentation and web addresses:
"https://github.com/supercollider-quarks/quarks".aid;

// Local HTML files:
(SCDoc.helpTargetDir +/+ "Guides/AID.html").aid;
(SCDoc.helpTargetDir +/+ "help.html").aid;

// Local SCD files:
(Quarks.folder +/+ "AID/AID.scd").aid;

// Local SC files:
(Quarks.folder +/+ "AID/Classes/extString.sc").aid

 // Local RTF files:
(Quarks.folder +/+ "AID/README.rtf").aid;

// Quark folders (opens in the HelpBrowser for easy access to various help documents):
(Quarks.folder +/+ "AID").aid;
