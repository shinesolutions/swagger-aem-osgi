//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties {
  /// Returns a new [ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties] instance.
  ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties({
    this.oauthPeriodConfigmanagerPeriodImsPeriodConfigid,
    this.imsPeriodOwningEntity,
    this.aemPeriodInstanceId,
    this.imsPeriodServiceCode,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? oauthPeriodConfigmanagerPeriodImsPeriodConfigid;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? imsPeriodOwningEntity;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? aemPeriodInstanceId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? imsPeriodServiceCode;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties &&
    other.oauthPeriodConfigmanagerPeriodImsPeriodConfigid == oauthPeriodConfigmanagerPeriodImsPeriodConfigid &&
    other.imsPeriodOwningEntity == imsPeriodOwningEntity &&
    other.aemPeriodInstanceId == aemPeriodInstanceId &&
    other.imsPeriodServiceCode == imsPeriodServiceCode;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (oauthPeriodConfigmanagerPeriodImsPeriodConfigid == null ? 0 : oauthPeriodConfigmanagerPeriodImsPeriodConfigid!.hashCode) +
    (imsPeriodOwningEntity == null ? 0 : imsPeriodOwningEntity!.hashCode) +
    (aemPeriodInstanceId == null ? 0 : aemPeriodInstanceId!.hashCode) +
    (imsPeriodServiceCode == null ? 0 : imsPeriodServiceCode!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties[oauthPeriodConfigmanagerPeriodImsPeriodConfigid=$oauthPeriodConfigmanagerPeriodImsPeriodConfigid, imsPeriodOwningEntity=$imsPeriodOwningEntity, aemPeriodInstanceId=$aemPeriodInstanceId, imsPeriodServiceCode=$imsPeriodServiceCode]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.oauthPeriodConfigmanagerPeriodImsPeriodConfigid != null) {
      json[r'oauth.configmanager.ims.configid'] = this.oauthPeriodConfigmanagerPeriodImsPeriodConfigid;
    } else {
      json[r'oauth.configmanager.ims.configid'] = null;
    }
    if (this.imsPeriodOwningEntity != null) {
      json[r'ims.owningEntity'] = this.imsPeriodOwningEntity;
    } else {
      json[r'ims.owningEntity'] = null;
    }
    if (this.aemPeriodInstanceId != null) {
      json[r'aem.instanceId'] = this.aemPeriodInstanceId;
    } else {
      json[r'aem.instanceId'] = null;
    }
    if (this.imsPeriodServiceCode != null) {
      json[r'ims.serviceCode'] = this.imsPeriodServiceCode;
    } else {
      json[r'ims.serviceCode'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties(
        oauthPeriodConfigmanagerPeriodImsPeriodConfigid: ConfigNodePropertyString.fromJson(json[r'oauth.configmanager.ims.configid']),
        imsPeriodOwningEntity: ConfigNodePropertyString.fromJson(json[r'ims.owningEntity']),
        aemPeriodInstanceId: ConfigNodePropertyString.fromJson(json[r'aem.instanceId']),
        imsPeriodServiceCode: ConfigNodePropertyString.fromJson(json[r'ims.serviceCode']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

