//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties {
  /// Returns a new [ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties] instance.
  ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties({
    this.disabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? disabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties &&
    other.disabled == disabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (disabled == null ? 0 : disabled!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties[disabled=$disabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.disabled != null) {
      json[r'disabled'] = this.disabled;
    } else {
      json[r'disabled'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties(
        disabled: ConfigNodePropertyBoolean.fromJson(json[r'disabled']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

