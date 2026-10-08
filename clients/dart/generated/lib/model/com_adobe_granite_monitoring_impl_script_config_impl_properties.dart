//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteMonitoringImplScriptConfigImplProperties {
  /// Returns a new [ComAdobeGraniteMonitoringImplScriptConfigImplProperties] instance.
  ComAdobeGraniteMonitoringImplScriptConfigImplProperties({
    this.scriptPeriodFilename,
    this.scriptPeriodDisplay,
    this.scriptPeriodPath,
    this.scriptPeriodPlatform,
    this.interval,
    this.jmxdomain,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? scriptPeriodFilename;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? scriptPeriodDisplay;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? scriptPeriodPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? scriptPeriodPlatform;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? interval;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jmxdomain;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteMonitoringImplScriptConfigImplProperties &&
    other.scriptPeriodFilename == scriptPeriodFilename &&
    other.scriptPeriodDisplay == scriptPeriodDisplay &&
    other.scriptPeriodPath == scriptPeriodPath &&
    other.scriptPeriodPlatform == scriptPeriodPlatform &&
    other.interval == interval &&
    other.jmxdomain == jmxdomain;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (scriptPeriodFilename == null ? 0 : scriptPeriodFilename!.hashCode) +
    (scriptPeriodDisplay == null ? 0 : scriptPeriodDisplay!.hashCode) +
    (scriptPeriodPath == null ? 0 : scriptPeriodPath!.hashCode) +
    (scriptPeriodPlatform == null ? 0 : scriptPeriodPlatform!.hashCode) +
    (interval == null ? 0 : interval!.hashCode) +
    (jmxdomain == null ? 0 : jmxdomain!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteMonitoringImplScriptConfigImplProperties[scriptPeriodFilename=$scriptPeriodFilename, scriptPeriodDisplay=$scriptPeriodDisplay, scriptPeriodPath=$scriptPeriodPath, scriptPeriodPlatform=$scriptPeriodPlatform, interval=$interval, jmxdomain=$jmxdomain]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.scriptPeriodFilename != null) {
      json[r'script.filename'] = this.scriptPeriodFilename;
    } else {
      json[r'script.filename'] = null;
    }
    if (this.scriptPeriodDisplay != null) {
      json[r'script.display'] = this.scriptPeriodDisplay;
    } else {
      json[r'script.display'] = null;
    }
    if (this.scriptPeriodPath != null) {
      json[r'script.path'] = this.scriptPeriodPath;
    } else {
      json[r'script.path'] = null;
    }
    if (this.scriptPeriodPlatform != null) {
      json[r'script.platform'] = this.scriptPeriodPlatform;
    } else {
      json[r'script.platform'] = null;
    }
    if (this.interval != null) {
      json[r'interval'] = this.interval;
    } else {
      json[r'interval'] = null;
    }
    if (this.jmxdomain != null) {
      json[r'jmxdomain'] = this.jmxdomain;
    } else {
      json[r'jmxdomain'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteMonitoringImplScriptConfigImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteMonitoringImplScriptConfigImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteMonitoringImplScriptConfigImplProperties(
        scriptPeriodFilename: ConfigNodePropertyString.fromJson(json[r'script.filename']),
        scriptPeriodDisplay: ConfigNodePropertyString.fromJson(json[r'script.display']),
        scriptPeriodPath: ConfigNodePropertyString.fromJson(json[r'script.path']),
        scriptPeriodPlatform: ConfigNodePropertyArray.fromJson(json[r'script.platform']),
        interval: ConfigNodePropertyInteger.fromJson(json[r'interval']),
        jmxdomain: ConfigNodePropertyString.fromJson(json[r'jmxdomain']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteMonitoringImplScriptConfigImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteMonitoringImplScriptConfigImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteMonitoringImplScriptConfigImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteMonitoringImplScriptConfigImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteMonitoringImplScriptConfigImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteMonitoringImplScriptConfigImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteMonitoringImplScriptConfigImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteMonitoringImplScriptConfigImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteMonitoringImplScriptConfigImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteMonitoringImplScriptConfigImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

