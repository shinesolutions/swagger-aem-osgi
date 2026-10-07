//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties {
  /// Returns a new [ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties] instance.
  ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties({
    this.cqPeriodDamPeriodAllowPeriodAllPeriodMime,
    this.cqPeriodDamPeriodAllowedPeriodAssetPeriodMimes,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodDamPeriodAllowPeriodAllPeriodMime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodDamPeriodAllowedPeriodAssetPeriodMimes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties &&
    other.cqPeriodDamPeriodAllowPeriodAllPeriodMime == cqPeriodDamPeriodAllowPeriodAllPeriodMime &&
    other.cqPeriodDamPeriodAllowedPeriodAssetPeriodMimes == cqPeriodDamPeriodAllowedPeriodAssetPeriodMimes;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodAllowPeriodAllPeriodMime == null ? 0 : cqPeriodDamPeriodAllowPeriodAllPeriodMime!.hashCode) +
    (cqPeriodDamPeriodAllowedPeriodAssetPeriodMimes == null ? 0 : cqPeriodDamPeriodAllowedPeriodAssetPeriodMimes!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties[cqPeriodDamPeriodAllowPeriodAllPeriodMime=$cqPeriodDamPeriodAllowPeriodAllPeriodMime, cqPeriodDamPeriodAllowedPeriodAssetPeriodMimes=$cqPeriodDamPeriodAllowedPeriodAssetPeriodMimes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodAllowPeriodAllPeriodMime != null) {
      json[r'cq.dam.allow.all.mime'] = this.cqPeriodDamPeriodAllowPeriodAllPeriodMime;
    } else {
      json[r'cq.dam.allow.all.mime'] = null;
    }
    if (this.cqPeriodDamPeriodAllowedPeriodAssetPeriodMimes != null) {
      json[r'cq.dam.allowed.asset.mimes'] = this.cqPeriodDamPeriodAllowedPeriodAssetPeriodMimes;
    } else {
      json[r'cq.dam.allowed.asset.mimes'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties(
        cqPeriodDamPeriodAllowPeriodAllPeriodMime: ConfigNodePropertyBoolean.fromJson(json[r'cq.dam.allow.all.mime']),
        cqPeriodDamPeriodAllowedPeriodAssetPeriodMimes: ConfigNodePropertyArray.fromJson(json[r'cq.dam.allowed.asset.mimes']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

