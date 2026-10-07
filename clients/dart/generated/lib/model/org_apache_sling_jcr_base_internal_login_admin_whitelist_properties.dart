//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties {
  /// Returns a new [OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties] instance.
  OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties({
    this.whitelistPeriodBypass,
    this.whitelistPeriodBundlesPeriodRegexp,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? whitelistPeriodBypass;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? whitelistPeriodBundlesPeriodRegexp;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties &&
    other.whitelistPeriodBypass == whitelistPeriodBypass &&
    other.whitelistPeriodBundlesPeriodRegexp == whitelistPeriodBundlesPeriodRegexp;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (whitelistPeriodBypass == null ? 0 : whitelistPeriodBypass!.hashCode) +
    (whitelistPeriodBundlesPeriodRegexp == null ? 0 : whitelistPeriodBundlesPeriodRegexp!.hashCode);

  @override
  String toString() => 'OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties[whitelistPeriodBypass=$whitelistPeriodBypass, whitelistPeriodBundlesPeriodRegexp=$whitelistPeriodBundlesPeriodRegexp]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.whitelistPeriodBypass != null) {
      json[r'whitelist.bypass'] = this.whitelistPeriodBypass;
    } else {
      json[r'whitelist.bypass'] = null;
    }
    if (this.whitelistPeriodBundlesPeriodRegexp != null) {
      json[r'whitelist.bundles.regexp'] = this.whitelistPeriodBundlesPeriodRegexp;
    } else {
      json[r'whitelist.bundles.regexp'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties(
        whitelistPeriodBypass: ConfigNodePropertyBoolean.fromJson(json[r'whitelist.bypass']),
        whitelistPeriodBundlesPeriodRegexp: ConfigNodePropertyString.fromJson(json[r'whitelist.bundles.regexp']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

