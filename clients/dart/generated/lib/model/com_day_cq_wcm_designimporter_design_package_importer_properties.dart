//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmDesignimporterDesignPackageImporterProperties {
  /// Returns a new [ComDayCqWcmDesignimporterDesignPackageImporterProperties] instance.
  ComDayCqWcmDesignimporterDesignPackageImporterProperties({
    this.extractPeriodFilter,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? extractPeriodFilter;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmDesignimporterDesignPackageImporterProperties &&
    other.extractPeriodFilter == extractPeriodFilter;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (extractPeriodFilter == null ? 0 : extractPeriodFilter!.hashCode);

  @override
  String toString() => 'ComDayCqWcmDesignimporterDesignPackageImporterProperties[extractPeriodFilter=$extractPeriodFilter]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.extractPeriodFilter != null) {
      json[r'extract.filter'] = this.extractPeriodFilter;
    } else {
      json[r'extract.filter'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmDesignimporterDesignPackageImporterProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmDesignimporterDesignPackageImporterProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmDesignimporterDesignPackageImporterProperties(
        extractPeriodFilter: ConfigNodePropertyArray.fromJson(json[r'extract.filter']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmDesignimporterDesignPackageImporterProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmDesignimporterDesignPackageImporterProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmDesignimporterDesignPackageImporterProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmDesignimporterDesignPackageImporterProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmDesignimporterDesignPackageImporterProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmDesignimporterDesignPackageImporterProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmDesignimporterDesignPackageImporterProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmDesignimporterDesignPackageImporterProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmDesignimporterDesignPackageImporterProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmDesignimporterDesignPackageImporterProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

