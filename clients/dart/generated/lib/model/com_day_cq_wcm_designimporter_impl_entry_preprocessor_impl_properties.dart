//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties {
  /// Returns a new [ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties] instance.
  ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties({
    this.searchPeriodPattern,
    this.replacePeriodPattern,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? searchPeriodPattern;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? replacePeriodPattern;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties &&
    other.searchPeriodPattern == searchPeriodPattern &&
    other.replacePeriodPattern == replacePeriodPattern;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (searchPeriodPattern == null ? 0 : searchPeriodPattern!.hashCode) +
    (replacePeriodPattern == null ? 0 : replacePeriodPattern!.hashCode);

  @override
  String toString() => 'ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties[searchPeriodPattern=$searchPeriodPattern, replacePeriodPattern=$replacePeriodPattern]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.searchPeriodPattern != null) {
      json[r'search.pattern'] = this.searchPeriodPattern;
    } else {
      json[r'search.pattern'] = null;
    }
    if (this.replacePeriodPattern != null) {
      json[r'replace.pattern'] = this.replacePeriodPattern;
    } else {
      json[r'replace.pattern'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties(
        searchPeriodPattern: ConfigNodePropertyString.fromJson(json[r'search.pattern']),
        replacePeriodPattern: ConfigNodePropertyString.fromJson(json[r'replace.pattern']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

