//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties {
  /// Returns a new [ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties] instance.
  ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties({
    this.oauthPeriodIssuer,
    this.oauthPeriodAccessPeriodTokenPeriodExpiresPeriodIn,
    this.osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern,
    this.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? oauthPeriodIssuer;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? oauthPeriodAccessPeriodTokenPeriodExpiresPeriodIn;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties &&
    other.oauthPeriodIssuer == oauthPeriodIssuer &&
    other.oauthPeriodAccessPeriodTokenPeriodExpiresPeriodIn == oauthPeriodAccessPeriodTokenPeriodExpiresPeriodIn &&
    other.osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern == osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern &&
    other.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect == osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (oauthPeriodIssuer == null ? 0 : oauthPeriodIssuer!.hashCode) +
    (oauthPeriodAccessPeriodTokenPeriodExpiresPeriodIn == null ? 0 : oauthPeriodAccessPeriodTokenPeriodExpiresPeriodIn!.hashCode) +
    (osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern == null ? 0 : osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern!.hashCode) +
    (osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect == null ? 0 : osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties[oauthPeriodIssuer=$oauthPeriodIssuer, oauthPeriodAccessPeriodTokenPeriodExpiresPeriodIn=$oauthPeriodAccessPeriodTokenPeriodExpiresPeriodIn, osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern=$osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern, osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect=$osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.oauthPeriodIssuer != null) {
      json[r'oauth.issuer'] = this.oauthPeriodIssuer;
    } else {
      json[r'oauth.issuer'] = null;
    }
    if (this.oauthPeriodAccessPeriodTokenPeriodExpiresPeriodIn != null) {
      json[r'oauth.access.token.expires.in'] = this.oauthPeriodAccessPeriodTokenPeriodExpiresPeriodIn;
    } else {
      json[r'oauth.access.token.expires.in'] = null;
    }
    if (this.osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern != null) {
      json[r'osgi.http.whiteboard.servlet.pattern'] = this.osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern;
    } else {
      json[r'osgi.http.whiteboard.servlet.pattern'] = null;
    }
    if (this.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect != null) {
      json[r'osgi.http.whiteboard.context.select'] = this.osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect;
    } else {
      json[r'osgi.http.whiteboard.context.select'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties(
        oauthPeriodIssuer: ConfigNodePropertyString.fromJson(json[r'oauth.issuer']),
        oauthPeriodAccessPeriodTokenPeriodExpiresPeriodIn: ConfigNodePropertyString.fromJson(json[r'oauth.access.token.expires.in']),
        osgiPeriodHttpPeriodWhiteboardPeriodServletPeriodPattern: ConfigNodePropertyString.fromJson(json[r'osgi.http.whiteboard.servlet.pattern']),
        osgiPeriodHttpPeriodWhiteboardPeriodContextPeriodSelect: ConfigNodePropertyString.fromJson(json[r'osgi.http.whiteboard.context.select']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

