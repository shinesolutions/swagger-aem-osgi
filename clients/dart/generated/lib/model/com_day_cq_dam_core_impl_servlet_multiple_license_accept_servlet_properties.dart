//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties {
  /// Returns a new [ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties] instance.
  ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties({
    this.cqPeriodDamPeriodDrmPeriodEnable,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodDamPeriodDrmPeriodEnable;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties &&
    other.cqPeriodDamPeriodDrmPeriodEnable == cqPeriodDamPeriodDrmPeriodEnable;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodDrmPeriodEnable == null ? 0 : cqPeriodDamPeriodDrmPeriodEnable!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties[cqPeriodDamPeriodDrmPeriodEnable=$cqPeriodDamPeriodDrmPeriodEnable]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodDrmPeriodEnable != null) {
      json[r'cq.dam.drm.enable'] = this.cqPeriodDamPeriodDrmPeriodEnable;
    } else {
      json[r'cq.dam.drm.enable'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties(
        cqPeriodDamPeriodDrmPeriodEnable: ConfigNodePropertyBoolean.fromJson(json[r'cq.dam.drm.enable']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

