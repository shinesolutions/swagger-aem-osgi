//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties {
  /// Returns a new [ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties] instance.
  ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties({
    this.pathBuilderPeriodTarget,
    this.suggestPeriodBasepath,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? pathBuilderPeriodTarget;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? suggestPeriodBasepath;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties &&
    other.pathBuilderPeriodTarget == pathBuilderPeriodTarget &&
    other.suggestPeriodBasepath == suggestPeriodBasepath;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (pathBuilderPeriodTarget == null ? 0 : pathBuilderPeriodTarget!.hashCode) +
    (suggestPeriodBasepath == null ? 0 : suggestPeriodBasepath!.hashCode);

  @override
  String toString() => 'ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties[pathBuilderPeriodTarget=$pathBuilderPeriodTarget, suggestPeriodBasepath=$suggestPeriodBasepath]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.pathBuilderPeriodTarget != null) {
      json[r'pathBuilder.target'] = this.pathBuilderPeriodTarget;
    } else {
      json[r'pathBuilder.target'] = null;
    }
    if (this.suggestPeriodBasepath != null) {
      json[r'suggest.basepath'] = this.suggestPeriodBasepath;
    } else {
      json[r'suggest.basepath'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties(
        pathBuilderPeriodTarget: ConfigNodePropertyString.fromJson(json[r'pathBuilder.target']),
        suggestPeriodBasepath: ConfigNodePropertyString.fromJson(json[r'suggest.basepath']),
      );
    }
    return null;
  }

  static List<ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

