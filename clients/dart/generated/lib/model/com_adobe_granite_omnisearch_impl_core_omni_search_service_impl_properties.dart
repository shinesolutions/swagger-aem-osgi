//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties {
  /// Returns a new [ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties] instance.
  ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties({
    this.omnisearchPeriodSuggestionPeriodRequiretextPeriodMin,
    this.omnisearchPeriodSuggestionPeriodSpellcheckPeriodRequire,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? omnisearchPeriodSuggestionPeriodRequiretextPeriodMin;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? omnisearchPeriodSuggestionPeriodSpellcheckPeriodRequire;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties &&
    other.omnisearchPeriodSuggestionPeriodRequiretextPeriodMin == omnisearchPeriodSuggestionPeriodRequiretextPeriodMin &&
    other.omnisearchPeriodSuggestionPeriodSpellcheckPeriodRequire == omnisearchPeriodSuggestionPeriodSpellcheckPeriodRequire;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (omnisearchPeriodSuggestionPeriodRequiretextPeriodMin == null ? 0 : omnisearchPeriodSuggestionPeriodRequiretextPeriodMin!.hashCode) +
    (omnisearchPeriodSuggestionPeriodSpellcheckPeriodRequire == null ? 0 : omnisearchPeriodSuggestionPeriodSpellcheckPeriodRequire!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties[omnisearchPeriodSuggestionPeriodRequiretextPeriodMin=$omnisearchPeriodSuggestionPeriodRequiretextPeriodMin, omnisearchPeriodSuggestionPeriodSpellcheckPeriodRequire=$omnisearchPeriodSuggestionPeriodSpellcheckPeriodRequire]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.omnisearchPeriodSuggestionPeriodRequiretextPeriodMin != null) {
      json[r'omnisearch.suggestion.requiretext.min'] = this.omnisearchPeriodSuggestionPeriodRequiretextPeriodMin;
    } else {
      json[r'omnisearch.suggestion.requiretext.min'] = null;
    }
    if (this.omnisearchPeriodSuggestionPeriodSpellcheckPeriodRequire != null) {
      json[r'omnisearch.suggestion.spellcheck.require'] = this.omnisearchPeriodSuggestionPeriodSpellcheckPeriodRequire;
    } else {
      json[r'omnisearch.suggestion.spellcheck.require'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties(
        omnisearchPeriodSuggestionPeriodRequiretextPeriodMin: ConfigNodePropertyInteger.fromJson(json[r'omnisearch.suggestion.requiretext.min']),
        omnisearchPeriodSuggestionPeriodSpellcheckPeriodRequire: ConfigNodePropertyBoolean.fromJson(json[r'omnisearch.suggestion.spellcheck.require']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

