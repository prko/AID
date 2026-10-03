# AID
A SuperCollider documentation lookup helper adding the aid method to the String class. It provides a fast, intuitive way to discover help files, URLs, and open any local file—ideal for SC novices and exploring third-party Quarks.

**AID** provides a fast, intuitive way to look up SuperCollider documentation directly from string literals for new users, occasional users, and those working with third-party Quarks.
It is syntactic sugar for `HelpBrowser.goTo("path")`, `"a/absolute/path/to/a/file".help`, and `"a/absolute/path/to/a/file".openOS`.

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
(Quarks.folder +/+ "AID/AID.scd").aid;
(Quarks.folder +/+ "AID/README.rtf").aid;
```

If no exact match is found, **AID** automatically falls back to the SuperCollider Help Search page.

```supercollider
"Pbinds".aid
```

## Why `.aid`?

Using `String:aid` instead of `String:help` prevents conflicts with existing extensions, main class library methods, and potential future SuperCollider updates.

## Compatibility

Tested with recent SuperCollider releases. This quark does not overwrite existing system classes and installs safely without requiring a `SystemOverwrites` directory.
