//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties {
  /// Returns a new [ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties] instance.
  ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties({
    this.hcPeriodTags,
    this.diskPeriodSpacePeriodWarnPeriodThreshold,
    this.diskPeriodSpacePeriodErrorPeriodThreshold,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? hcPeriodTags;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? diskPeriodSpacePeriodWarnPeriodThreshold;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? diskPeriodSpacePeriodErrorPeriodThreshold;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties &&
    other.hcPeriodTags == hcPeriodTags &&
    other.diskPeriodSpacePeriodWarnPeriodThreshold == diskPeriodSpacePeriodWarnPeriodThreshold &&
    other.diskPeriodSpacePeriodErrorPeriodThreshold == diskPeriodSpacePeriodErrorPeriodThreshold;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (hcPeriodTags == null ? 0 : hcPeriodTags!.hashCode) +
    (diskPeriodSpacePeriodWarnPeriodThreshold == null ? 0 : diskPeriodSpacePeriodWarnPeriodThreshold!.hashCode) +
    (diskPeriodSpacePeriodErrorPeriodThreshold == null ? 0 : diskPeriodSpacePeriodErrorPeriodThreshold!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties[hcPeriodTags=$hcPeriodTags, diskPeriodSpacePeriodWarnPeriodThreshold=$diskPeriodSpacePeriodWarnPeriodThreshold, diskPeriodSpacePeriodErrorPeriodThreshold=$diskPeriodSpacePeriodErrorPeriodThreshold]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.hcPeriodTags != null) {
      json[r'hc.tags'] = this.hcPeriodTags;
    } else {
      json[r'hc.tags'] = null;
    }
    if (this.diskPeriodSpacePeriodWarnPeriodThreshold != null) {
      json[r'disk.space.warn.threshold'] = this.diskPeriodSpacePeriodWarnPeriodThreshold;
    } else {
      json[r'disk.space.warn.threshold'] = null;
    }
    if (this.diskPeriodSpacePeriodErrorPeriodThreshold != null) {
      json[r'disk.space.error.threshold'] = this.diskPeriodSpacePeriodErrorPeriodThreshold;
    } else {
      json[r'disk.space.error.threshold'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties(
        hcPeriodTags: ConfigNodePropertyArray.fromJson(json[r'hc.tags']),
        diskPeriodSpacePeriodWarnPeriodThreshold: ConfigNodePropertyInteger.fromJson(json[r'disk.space.warn.threshold']),
        diskPeriodSpacePeriodErrorPeriodThreshold: ConfigNodePropertyInteger.fromJson(json[r'disk.space.error.threshold']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

