//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplServletAssetStatusServletProperties {
  /// Returns a new [ComDayCqDamCoreImplServletAssetStatusServletProperties] instance.
  ComDayCqDamCoreImplServletAssetStatusServletProperties({
    this.cqPeriodDamPeriodBatchPeriodStatusPeriodMaxassets,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodDamPeriodBatchPeriodStatusPeriodMaxassets;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplServletAssetStatusServletProperties &&
    other.cqPeriodDamPeriodBatchPeriodStatusPeriodMaxassets == cqPeriodDamPeriodBatchPeriodStatusPeriodMaxassets;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodBatchPeriodStatusPeriodMaxassets == null ? 0 : cqPeriodDamPeriodBatchPeriodStatusPeriodMaxassets!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplServletAssetStatusServletProperties[cqPeriodDamPeriodBatchPeriodStatusPeriodMaxassets=$cqPeriodDamPeriodBatchPeriodStatusPeriodMaxassets]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodBatchPeriodStatusPeriodMaxassets != null) {
      json[r'cq.dam.batch.status.maxassets'] = this.cqPeriodDamPeriodBatchPeriodStatusPeriodMaxassets;
    } else {
      json[r'cq.dam.batch.status.maxassets'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplServletAssetStatusServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplServletAssetStatusServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplServletAssetStatusServletProperties(
        cqPeriodDamPeriodBatchPeriodStatusPeriodMaxassets: ConfigNodePropertyInteger.fromJson(json[r'cq.dam.batch.status.maxassets']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplServletAssetStatusServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplServletAssetStatusServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplServletAssetStatusServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplServletAssetStatusServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplServletAssetStatusServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplServletAssetStatusServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplServletAssetStatusServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplServletAssetStatusServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplServletAssetStatusServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplServletAssetStatusServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

