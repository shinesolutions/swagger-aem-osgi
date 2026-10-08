//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties {
  /// Returns a new [ComDayCqDamCoreImplServletAssetXMPSearchServletProperties] instance.
  ComDayCqDamCoreImplServletAssetXMPSearchServletProperties({
    this.cqPeriodDamPeriodBatchPeriodIndesignPeriodMaxassets,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodDamPeriodBatchPeriodIndesignPeriodMaxassets;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplServletAssetXMPSearchServletProperties &&
    other.cqPeriodDamPeriodBatchPeriodIndesignPeriodMaxassets == cqPeriodDamPeriodBatchPeriodIndesignPeriodMaxassets;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodBatchPeriodIndesignPeriodMaxassets == null ? 0 : cqPeriodDamPeriodBatchPeriodIndesignPeriodMaxassets!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplServletAssetXMPSearchServletProperties[cqPeriodDamPeriodBatchPeriodIndesignPeriodMaxassets=$cqPeriodDamPeriodBatchPeriodIndesignPeriodMaxassets]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodBatchPeriodIndesignPeriodMaxassets != null) {
      json[r'cq.dam.batch.indesign.maxassets'] = this.cqPeriodDamPeriodBatchPeriodIndesignPeriodMaxassets;
    } else {
      json[r'cq.dam.batch.indesign.maxassets'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplServletAssetXMPSearchServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplServletAssetXMPSearchServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplServletAssetXMPSearchServletProperties(
        cqPeriodDamPeriodBatchPeriodIndesignPeriodMaxassets: ConfigNodePropertyInteger.fromJson(json[r'cq.dam.batch.indesign.maxassets']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplServletAssetXMPSearchServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplServletAssetXMPSearchServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplServletAssetXMPSearchServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplServletAssetXMPSearchServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplServletAssetXMPSearchServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplServletAssetXMPSearchServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplServletAssetXMPSearchServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplServletAssetXMPSearchServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplServletAssetXMPSearchServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplServletAssetXMPSearchServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

