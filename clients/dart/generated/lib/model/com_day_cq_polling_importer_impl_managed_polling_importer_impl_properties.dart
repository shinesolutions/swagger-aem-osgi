//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqPollingImporterImplManagedPollingImporterImplProperties {
  /// Returns a new [ComDayCqPollingImporterImplManagedPollingImporterImplProperties] instance.
  ComDayCqPollingImporterImplManagedPollingImporterImplProperties({
    this.importerPeriodUser,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? importerPeriodUser;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqPollingImporterImplManagedPollingImporterImplProperties &&
    other.importerPeriodUser == importerPeriodUser;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (importerPeriodUser == null ? 0 : importerPeriodUser!.hashCode);

  @override
  String toString() => 'ComDayCqPollingImporterImplManagedPollingImporterImplProperties[importerPeriodUser=$importerPeriodUser]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.importerPeriodUser != null) {
      json[r'importer.user'] = this.importerPeriodUser;
    } else {
      json[r'importer.user'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqPollingImporterImplManagedPollingImporterImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqPollingImporterImplManagedPollingImporterImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqPollingImporterImplManagedPollingImporterImplProperties(
        importerPeriodUser: ConfigNodePropertyString.fromJson(json[r'importer.user']),
      );
    }
    return null;
  }

  static List<ComDayCqPollingImporterImplManagedPollingImporterImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqPollingImporterImplManagedPollingImporterImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqPollingImporterImplManagedPollingImporterImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqPollingImporterImplManagedPollingImporterImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqPollingImporterImplManagedPollingImporterImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqPollingImporterImplManagedPollingImporterImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqPollingImporterImplManagedPollingImporterImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqPollingImporterImplManagedPollingImporterImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqPollingImporterImplManagedPollingImporterImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqPollingImporterImplManagedPollingImporterImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

