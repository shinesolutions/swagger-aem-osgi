//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties {
  /// Returns a new [ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties] instance.
  ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties({
    this.xmpPeriodFilterPeriodApplyWhitelist,
    this.xmpPeriodFilterPeriodWhitelist,
    this.xmpPeriodFilterPeriodApplyBlacklist,
    this.xmpPeriodFilterPeriodBlacklist,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? xmpPeriodFilterPeriodApplyWhitelist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? xmpPeriodFilterPeriodWhitelist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? xmpPeriodFilterPeriodApplyBlacklist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? xmpPeriodFilterPeriodBlacklist;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties &&
    other.xmpPeriodFilterPeriodApplyWhitelist == xmpPeriodFilterPeriodApplyWhitelist &&
    other.xmpPeriodFilterPeriodWhitelist == xmpPeriodFilterPeriodWhitelist &&
    other.xmpPeriodFilterPeriodApplyBlacklist == xmpPeriodFilterPeriodApplyBlacklist &&
    other.xmpPeriodFilterPeriodBlacklist == xmpPeriodFilterPeriodBlacklist;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (xmpPeriodFilterPeriodApplyWhitelist == null ? 0 : xmpPeriodFilterPeriodApplyWhitelist!.hashCode) +
    (xmpPeriodFilterPeriodWhitelist == null ? 0 : xmpPeriodFilterPeriodWhitelist!.hashCode) +
    (xmpPeriodFilterPeriodApplyBlacklist == null ? 0 : xmpPeriodFilterPeriodApplyBlacklist!.hashCode) +
    (xmpPeriodFilterPeriodBlacklist == null ? 0 : xmpPeriodFilterPeriodBlacklist!.hashCode);

  @override
  String toString() => 'ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties[xmpPeriodFilterPeriodApplyWhitelist=$xmpPeriodFilterPeriodApplyWhitelist, xmpPeriodFilterPeriodWhitelist=$xmpPeriodFilterPeriodWhitelist, xmpPeriodFilterPeriodApplyBlacklist=$xmpPeriodFilterPeriodApplyBlacklist, xmpPeriodFilterPeriodBlacklist=$xmpPeriodFilterPeriodBlacklist]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.xmpPeriodFilterPeriodApplyWhitelist != null) {
      json[r'xmp.filter.apply_whitelist'] = this.xmpPeriodFilterPeriodApplyWhitelist;
    } else {
      json[r'xmp.filter.apply_whitelist'] = null;
    }
    if (this.xmpPeriodFilterPeriodWhitelist != null) {
      json[r'xmp.filter.whitelist'] = this.xmpPeriodFilterPeriodWhitelist;
    } else {
      json[r'xmp.filter.whitelist'] = null;
    }
    if (this.xmpPeriodFilterPeriodApplyBlacklist != null) {
      json[r'xmp.filter.apply_blacklist'] = this.xmpPeriodFilterPeriodApplyBlacklist;
    } else {
      json[r'xmp.filter.apply_blacklist'] = null;
    }
    if (this.xmpPeriodFilterPeriodBlacklist != null) {
      json[r'xmp.filter.blacklist'] = this.xmpPeriodFilterPeriodBlacklist;
    } else {
      json[r'xmp.filter.blacklist'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties(
        xmpPeriodFilterPeriodApplyWhitelist: ConfigNodePropertyBoolean.fromJson(json[r'xmp.filter.apply_whitelist']),
        xmpPeriodFilterPeriodWhitelist: ConfigNodePropertyArray.fromJson(json[r'xmp.filter.whitelist']),
        xmpPeriodFilterPeriodApplyBlacklist: ConfigNodePropertyBoolean.fromJson(json[r'xmp.filter.apply_blacklist']),
        xmpPeriodFilterPeriodBlacklist: ConfigNodePropertyArray.fromJson(json[r'xmp.filter.blacklist']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

