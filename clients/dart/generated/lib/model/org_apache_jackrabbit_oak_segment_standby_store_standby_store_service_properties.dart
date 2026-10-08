//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties {
  /// Returns a new [OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties] instance.
  OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties({
    this.orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist,
    this.mode,
    this.port,
    this.primaryPeriodHost,
    this.interval,
    this.primaryPeriodAllowedClientIpRanges,
    this.secure,
    this.standbyPeriodReadtimeout,
    this.standbyPeriodAutoclean,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? mode;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? port;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? primaryPeriodHost;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? interval;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? primaryPeriodAllowedClientIpRanges;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? secure;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? standbyPeriodReadtimeout;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? standbyPeriodAutoclean;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties &&
    other.orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist == orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist &&
    other.mode == mode &&
    other.port == port &&
    other.primaryPeriodHost == primaryPeriodHost &&
    other.interval == interval &&
    other.primaryPeriodAllowedClientIpRanges == primaryPeriodAllowedClientIpRanges &&
    other.secure == secure &&
    other.standbyPeriodReadtimeout == standbyPeriodReadtimeout &&
    other.standbyPeriodAutoclean == standbyPeriodAutoclean;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist == null ? 0 : orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist!.hashCode) +
    (mode == null ? 0 : mode!.hashCode) +
    (port == null ? 0 : port!.hashCode) +
    (primaryPeriodHost == null ? 0 : primaryPeriodHost!.hashCode) +
    (interval == null ? 0 : interval!.hashCode) +
    (primaryPeriodAllowedClientIpRanges == null ? 0 : primaryPeriodAllowedClientIpRanges!.hashCode) +
    (secure == null ? 0 : secure!.hashCode) +
    (standbyPeriodReadtimeout == null ? 0 : standbyPeriodReadtimeout!.hashCode) +
    (standbyPeriodAutoclean == null ? 0 : standbyPeriodAutoclean!.hashCode);

  @override
  String toString() => 'OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties[orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist=$orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist, mode=$mode, port=$port, primaryPeriodHost=$primaryPeriodHost, interval=$interval, primaryPeriodAllowedClientIpRanges=$primaryPeriodAllowedClientIpRanges, secure=$secure, standbyPeriodReadtimeout=$standbyPeriodReadtimeout, standbyPeriodAutoclean=$standbyPeriodAutoclean]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist != null) {
      json[r'org.apache.sling.installer.configuration.persist'] = this.orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist;
    } else {
      json[r'org.apache.sling.installer.configuration.persist'] = null;
    }
    if (this.mode != null) {
      json[r'mode'] = this.mode;
    } else {
      json[r'mode'] = null;
    }
    if (this.port != null) {
      json[r'port'] = this.port;
    } else {
      json[r'port'] = null;
    }
    if (this.primaryPeriodHost != null) {
      json[r'primary.host'] = this.primaryPeriodHost;
    } else {
      json[r'primary.host'] = null;
    }
    if (this.interval != null) {
      json[r'interval'] = this.interval;
    } else {
      json[r'interval'] = null;
    }
    if (this.primaryPeriodAllowedClientIpRanges != null) {
      json[r'primary.allowed-client-ip-ranges'] = this.primaryPeriodAllowedClientIpRanges;
    } else {
      json[r'primary.allowed-client-ip-ranges'] = null;
    }
    if (this.secure != null) {
      json[r'secure'] = this.secure;
    } else {
      json[r'secure'] = null;
    }
    if (this.standbyPeriodReadtimeout != null) {
      json[r'standby.readtimeout'] = this.standbyPeriodReadtimeout;
    } else {
      json[r'standby.readtimeout'] = null;
    }
    if (this.standbyPeriodAutoclean != null) {
      json[r'standby.autoclean'] = this.standbyPeriodAutoclean;
    } else {
      json[r'standby.autoclean'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties(
        orgPeriodApachePeriodSlingPeriodInstallerPeriodConfigurationPeriodPersist: ConfigNodePropertyBoolean.fromJson(json[r'org.apache.sling.installer.configuration.persist']),
        mode: ConfigNodePropertyDropDown.fromJson(json[r'mode']),
        port: ConfigNodePropertyInteger.fromJson(json[r'port']),
        primaryPeriodHost: ConfigNodePropertyString.fromJson(json[r'primary.host']),
        interval: ConfigNodePropertyInteger.fromJson(json[r'interval']),
        primaryPeriodAllowedClientIpRanges: ConfigNodePropertyArray.fromJson(json[r'primary.allowed-client-ip-ranges']),
        secure: ConfigNodePropertyBoolean.fromJson(json[r'secure']),
        standbyPeriodReadtimeout: ConfigNodePropertyInteger.fromJson(json[r'standby.readtimeout']),
        standbyPeriodAutoclean: ConfigNodePropertyBoolean.fromJson(json[r'standby.autoclean']),
      );
    }
    return null;
  }

  static List<OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties-objects as value to a dart map
  static Map<String, List<OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

