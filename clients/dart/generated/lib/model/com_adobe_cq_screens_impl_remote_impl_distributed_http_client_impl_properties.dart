//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties {
  /// Returns a new [ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties] instance.
  ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties({
    this.comPeriodAdobePeriodAemPeriodScreensPeriodImplPeriodRemotePeriodRequestTimeout,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? comPeriodAdobePeriodAemPeriodScreensPeriodImplPeriodRemotePeriodRequestTimeout;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties &&
    other.comPeriodAdobePeriodAemPeriodScreensPeriodImplPeriodRemotePeriodRequestTimeout == comPeriodAdobePeriodAemPeriodScreensPeriodImplPeriodRemotePeriodRequestTimeout;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (comPeriodAdobePeriodAemPeriodScreensPeriodImplPeriodRemotePeriodRequestTimeout == null ? 0 : comPeriodAdobePeriodAemPeriodScreensPeriodImplPeriodRemotePeriodRequestTimeout!.hashCode);

  @override
  String toString() => 'ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties[comPeriodAdobePeriodAemPeriodScreensPeriodImplPeriodRemotePeriodRequestTimeout=$comPeriodAdobePeriodAemPeriodScreensPeriodImplPeriodRemotePeriodRequestTimeout]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.comPeriodAdobePeriodAemPeriodScreensPeriodImplPeriodRemotePeriodRequestTimeout != null) {
      json[r'com.adobe.aem.screens.impl.remote.request_timeout'] = this.comPeriodAdobePeriodAemPeriodScreensPeriodImplPeriodRemotePeriodRequestTimeout;
    } else {
      json[r'com.adobe.aem.screens.impl.remote.request_timeout'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties(
        comPeriodAdobePeriodAemPeriodScreensPeriodImplPeriodRemotePeriodRequestTimeout: ConfigNodePropertyInteger.fromJson(json[r'com.adobe.aem.screens.impl.remote.request_timeout']),
      );
    }
    return null;
  }

  static List<ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

