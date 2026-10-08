//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteContexthubImplContextHubImplProperties {
  /// Returns a new [ComAdobeGraniteContexthubImplContextHubImplProperties] instance.
  ComAdobeGraniteContexthubImplContextHubImplProperties({
    this.comPeriodAdobePeriodGranitePeriodContexthubPeriodSilentMode,
    this.comPeriodAdobePeriodGranitePeriodContexthubPeriodShowUi,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? comPeriodAdobePeriodGranitePeriodContexthubPeriodSilentMode;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? comPeriodAdobePeriodGranitePeriodContexthubPeriodShowUi;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteContexthubImplContextHubImplProperties &&
    other.comPeriodAdobePeriodGranitePeriodContexthubPeriodSilentMode == comPeriodAdobePeriodGranitePeriodContexthubPeriodSilentMode &&
    other.comPeriodAdobePeriodGranitePeriodContexthubPeriodShowUi == comPeriodAdobePeriodGranitePeriodContexthubPeriodShowUi;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (comPeriodAdobePeriodGranitePeriodContexthubPeriodSilentMode == null ? 0 : comPeriodAdobePeriodGranitePeriodContexthubPeriodSilentMode!.hashCode) +
    (comPeriodAdobePeriodGranitePeriodContexthubPeriodShowUi == null ? 0 : comPeriodAdobePeriodGranitePeriodContexthubPeriodShowUi!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteContexthubImplContextHubImplProperties[comPeriodAdobePeriodGranitePeriodContexthubPeriodSilentMode=$comPeriodAdobePeriodGranitePeriodContexthubPeriodSilentMode, comPeriodAdobePeriodGranitePeriodContexthubPeriodShowUi=$comPeriodAdobePeriodGranitePeriodContexthubPeriodShowUi]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.comPeriodAdobePeriodGranitePeriodContexthubPeriodSilentMode != null) {
      json[r'com.adobe.granite.contexthub.silent_mode'] = this.comPeriodAdobePeriodGranitePeriodContexthubPeriodSilentMode;
    } else {
      json[r'com.adobe.granite.contexthub.silent_mode'] = null;
    }
    if (this.comPeriodAdobePeriodGranitePeriodContexthubPeriodShowUi != null) {
      json[r'com.adobe.granite.contexthub.show_ui'] = this.comPeriodAdobePeriodGranitePeriodContexthubPeriodShowUi;
    } else {
      json[r'com.adobe.granite.contexthub.show_ui'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteContexthubImplContextHubImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteContexthubImplContextHubImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteContexthubImplContextHubImplProperties(
        comPeriodAdobePeriodGranitePeriodContexthubPeriodSilentMode: ConfigNodePropertyBoolean.fromJson(json[r'com.adobe.granite.contexthub.silent_mode']),
        comPeriodAdobePeriodGranitePeriodContexthubPeriodShowUi: ConfigNodePropertyBoolean.fromJson(json[r'com.adobe.granite.contexthub.show_ui']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteContexthubImplContextHubImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteContexthubImplContextHubImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteContexthubImplContextHubImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteContexthubImplContextHubImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteContexthubImplContextHubImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteContexthubImplContextHubImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteContexthubImplContextHubImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteContexthubImplContextHubImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteContexthubImplContextHubImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteContexthubImplContextHubImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

