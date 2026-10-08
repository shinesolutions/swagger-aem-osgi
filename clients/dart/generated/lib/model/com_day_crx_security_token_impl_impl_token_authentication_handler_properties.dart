//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties {
  /// Returns a new [ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties] instance.
  ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties({
    this.path,
    this.tokenPeriodRequiredPeriodAttr,
    this.tokenPeriodAlternatePeriodUrl,
    this.tokenPeriodEncapsulated,
    this.skipPeriodTokenPeriodRefresh,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? path;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? tokenPeriodRequiredPeriodAttr;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? tokenPeriodAlternatePeriodUrl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? tokenPeriodEncapsulated;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? skipPeriodTokenPeriodRefresh;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties &&
    other.path == path &&
    other.tokenPeriodRequiredPeriodAttr == tokenPeriodRequiredPeriodAttr &&
    other.tokenPeriodAlternatePeriodUrl == tokenPeriodAlternatePeriodUrl &&
    other.tokenPeriodEncapsulated == tokenPeriodEncapsulated &&
    other.skipPeriodTokenPeriodRefresh == skipPeriodTokenPeriodRefresh;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (path == null ? 0 : path!.hashCode) +
    (tokenPeriodRequiredPeriodAttr == null ? 0 : tokenPeriodRequiredPeriodAttr!.hashCode) +
    (tokenPeriodAlternatePeriodUrl == null ? 0 : tokenPeriodAlternatePeriodUrl!.hashCode) +
    (tokenPeriodEncapsulated == null ? 0 : tokenPeriodEncapsulated!.hashCode) +
    (skipPeriodTokenPeriodRefresh == null ? 0 : skipPeriodTokenPeriodRefresh!.hashCode);

  @override
  String toString() => 'ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties[path=$path, tokenPeriodRequiredPeriodAttr=$tokenPeriodRequiredPeriodAttr, tokenPeriodAlternatePeriodUrl=$tokenPeriodAlternatePeriodUrl, tokenPeriodEncapsulated=$tokenPeriodEncapsulated, skipPeriodTokenPeriodRefresh=$skipPeriodTokenPeriodRefresh]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.path != null) {
      json[r'path'] = this.path;
    } else {
      json[r'path'] = null;
    }
    if (this.tokenPeriodRequiredPeriodAttr != null) {
      json[r'token.required.attr'] = this.tokenPeriodRequiredPeriodAttr;
    } else {
      json[r'token.required.attr'] = null;
    }
    if (this.tokenPeriodAlternatePeriodUrl != null) {
      json[r'token.alternate.url'] = this.tokenPeriodAlternatePeriodUrl;
    } else {
      json[r'token.alternate.url'] = null;
    }
    if (this.tokenPeriodEncapsulated != null) {
      json[r'token.encapsulated'] = this.tokenPeriodEncapsulated;
    } else {
      json[r'token.encapsulated'] = null;
    }
    if (this.skipPeriodTokenPeriodRefresh != null) {
      json[r'skip.token.refresh'] = this.skipPeriodTokenPeriodRefresh;
    } else {
      json[r'skip.token.refresh'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties(
        path: ConfigNodePropertyString.fromJson(json[r'path']),
        tokenPeriodRequiredPeriodAttr: ConfigNodePropertyDropDown.fromJson(json[r'token.required.attr']),
        tokenPeriodAlternatePeriodUrl: ConfigNodePropertyString.fromJson(json[r'token.alternate.url']),
        tokenPeriodEncapsulated: ConfigNodePropertyBoolean.fromJson(json[r'token.encapsulated']),
        skipPeriodTokenPeriodRefresh: ConfigNodePropertyArray.fromJson(json[r'skip.token.refresh']),
      );
    }
    return null;
  }

  static List<ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties-objects as value to a dart map
  static Map<String, List<ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

