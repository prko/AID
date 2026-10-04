# AID
**AID** is a SuperCollider documentation lookup helper that adds the aid method to the String class. It provides a fast and intuitive way to look up help files, browse URLs, and open local files directly from string literals. This makes it ideal for SuperCollider novices, occasional users, and those exploring third-party Quarks.

It serves as syntactic sugar for `HelpBrowser.goTo("path")`, `"path".help`, and `"path".openOS`.

## Install

```supercollider
"https://github.com/prko/AID".include
```

## Usage

Append `.aid` to any string representing a class name, method, search term, URL, or local file path. It automatically routes the string to the help browser or opens local files (such as `.sc`, `.scd`, or any other format) in your operating system's default application:

```supercollider
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

// Online documentation and web addresses:
"https://github.com/supercollider-quarks/quarks".aid;

// Local HTML files:
(SCDoc.helpTargetDir +/+ "Guides/AID.html").aid;
(SCDoc.helpTargetDir +/+ "help.html").aid;

// Local files (opens in the OS default application):
(Quarks.folder +/+ "AID/AID.scd").aid; // Local SCD files
(Quarks.folder +/+ "AID/Classes/extString.sc").aid  // Local SC files
(Quarks.folder +/+ "AID/README.rtf").aid; // Local RTF files

// Local SCD files without path:
"test.scd".aid // "test.scd".resolveRelative.openDocument

// Quark folders (opens in the HelpBrowser for easy access to various help documents):
(Quarks.folder +/+ "AID").aid;
```

If no exact match is found, **AID** automatically falls back to the SuperCollider Help Search page.

```supercollider
"Pbinds".aid
```

## Why `.aid`?

Using `String:aid` instead of `String:help` prevents conflicts with existing extensions, main class library methods, and potential future SuperCollider updates.
