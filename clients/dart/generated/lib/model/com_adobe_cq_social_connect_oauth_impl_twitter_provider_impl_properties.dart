//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties {
  /// Returns a new [ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties] instance.
  ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties({
    this.oauthPeriodProviderPeriodId,
    this.oauthPeriodCloudPeriodConfigPeriodRoot,
    this.providerPeriodConfigPeriodRoot,
    this.providerPeriodConfigPeriodUserPeriodFolder,
    this.providerPeriodConfigPeriodTwitterPeriodEnablePeriodParams,
    this.providerPeriodConfigPeriodTwitterPeriodParams,
    this.providerPeriodConfigPeriodRefreshPeriodUserdataPeriodEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? oauthPeriodProviderPeriodId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? oauthPeriodCloudPeriodConfigPeriodRoot;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? providerPeriodConfigPeriodRoot;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? providerPeriodConfigPeriodUserPeriodFolder;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? providerPeriodConfigPeriodTwitterPeriodEnablePeriodParams;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? providerPeriodConfigPeriodTwitterPeriodParams;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? providerPeriodConfigPeriodRefreshPeriodUserdataPeriodEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties &&
    other.oauthPeriodProviderPeriodId == oauthPeriodProviderPeriodId &&
    other.oauthPeriodCloudPeriodConfigPeriodRoot == oauthPeriodCloudPeriodConfigPeriodRoot &&
    other.providerPeriodConfigPeriodRoot == providerPeriodConfigPeriodRoot &&
    other.providerPeriodConfigPeriodUserPeriodFolder == providerPeriodConfigPeriodUserPeriodFolder &&
    other.providerPeriodConfigPeriodTwitterPeriodEnablePeriodParams == providerPeriodConfigPeriodTwitterPeriodEnablePeriodParams &&
    other.providerPeriodConfigPeriodTwitterPeriodParams == providerPeriodConfigPeriodTwitterPeriodParams &&
    other.providerPeriodConfigPeriodRefreshPeriodUserdataPeriodEnabled == providerPeriodConfigPeriodRefreshPeriodUserdataPeriodEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (oauthPeriodProviderPeriodId == null ? 0 : oauthPeriodProviderPeriodId!.hashCode) +
    (oauthPeriodCloudPeriodConfigPeriodRoot == null ? 0 : oauthPeriodCloudPeriodConfigPeriodRoot!.hashCode) +
    (providerPeriodConfigPeriodRoot == null ? 0 : providerPeriodConfigPeriodRoot!.hashCode) +
    (providerPeriodConfigPeriodUserPeriodFolder == null ? 0 : providerPeriodConfigPeriodUserPeriodFolder!.hashCode) +
    (providerPeriodConfigPeriodTwitterPeriodEnablePeriodParams == null ? 0 : providerPeriodConfigPeriodTwitterPeriodEnablePeriodParams!.hashCode) +
    (providerPeriodConfigPeriodTwitterPeriodParams == null ? 0 : providerPeriodConfigPeriodTwitterPeriodParams!.hashCode) +
    (providerPeriodConfigPeriodRefreshPeriodUserdataPeriodEnabled == null ? 0 : providerPeriodConfigPeriodRefreshPeriodUserdataPeriodEnabled!.hashCode);

  @override
  String toString() => 'ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties[oauthPeriodProviderPeriodId=$oauthPeriodProviderPeriodId, oauthPeriodCloudPeriodConfigPeriodRoot=$oauthPeriodCloudPeriodConfigPeriodRoot, providerPeriodConfigPeriodRoot=$providerPeriodConfigPeriodRoot, providerPeriodConfigPeriodUserPeriodFolder=$providerPeriodConfigPeriodUserPeriodFolder, providerPeriodConfigPeriodTwitterPeriodEnablePeriodParams=$providerPeriodConfigPeriodTwitterPeriodEnablePeriodParams, providerPeriodConfigPeriodTwitterPeriodParams=$providerPeriodConfigPeriodTwitterPeriodParams, providerPeriodConfigPeriodRefreshPeriodUserdataPeriodEnabled=$providerPeriodConfigPeriodRefreshPeriodUserdataPeriodEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.oauthPeriodProviderPeriodId != null) {
      json[r'oauth.provider.id'] = this.oauthPeriodProviderPeriodId;
    } else {
      json[r'oauth.provider.id'] = null;
    }
    if (this.oauthPeriodCloudPeriodConfigPeriodRoot != null) {
      json[r'oauth.cloud.config.root'] = this.oauthPeriodCloudPeriodConfigPeriodRoot;
    } else {
      json[r'oauth.cloud.config.root'] = null;
    }
    if (this.providerPeriodConfigPeriodRoot != null) {
      json[r'provider.config.root'] = this.providerPeriodConfigPeriodRoot;
    } else {
      json[r'provider.config.root'] = null;
    }
    if (this.providerPeriodConfigPeriodUserPeriodFolder != null) {
      json[r'provider.config.user.folder'] = this.providerPeriodConfigPeriodUserPeriodFolder;
    } else {
      json[r'provider.config.user.folder'] = null;
    }
    if (this.providerPeriodConfigPeriodTwitterPeriodEnablePeriodParams != null) {
      json[r'provider.config.twitter.enable.params'] = this.providerPeriodConfigPeriodTwitterPeriodEnablePeriodParams;
    } else {
      json[r'provider.config.twitter.enable.params'] = null;
    }
    if (this.providerPeriodConfigPeriodTwitterPeriodParams != null) {
      json[r'provider.config.twitter.params'] = this.providerPeriodConfigPeriodTwitterPeriodParams;
    } else {
      json[r'provider.config.twitter.params'] = null;
    }
    if (this.providerPeriodConfigPeriodRefreshPeriodUserdataPeriodEnabled != null) {
      json[r'provider.config.refresh.userdata.enabled'] = this.providerPeriodConfigPeriodRefreshPeriodUserdataPeriodEnabled;
    } else {
      json[r'provider.config.refresh.userdata.enabled'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties(
        oauthPeriodProviderPeriodId: ConfigNodePropertyString.fromJson(json[r'oauth.provider.id']),
        oauthPeriodCloudPeriodConfigPeriodRoot: ConfigNodePropertyString.fromJson(json[r'oauth.cloud.config.root']),
        providerPeriodConfigPeriodRoot: ConfigNodePropertyString.fromJson(json[r'provider.config.root']),
        providerPeriodConfigPeriodUserPeriodFolder: ConfigNodePropertyDropDown.fromJson(json[r'provider.config.user.folder']),
        providerPeriodConfigPeriodTwitterPeriodEnablePeriodParams: ConfigNodePropertyBoolean.fromJson(json[r'provider.config.twitter.enable.params']),
        providerPeriodConfigPeriodTwitterPeriodParams: ConfigNodePropertyArray.fromJson(json[r'provider.config.twitter.params']),
        providerPeriodConfigPeriodRefreshPeriodUserdataPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'provider.config.refresh.userdata.enabled']),
      );
    }
    return null;
  }

  static List<ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

