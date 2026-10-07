//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingServletsPostImplSlingPostServletProperties {
  /// Returns a new [OrgApacheSlingServletsPostImplSlingPostServletProperties] instance.
  OrgApacheSlingServletsPostImplSlingPostServletProperties({
    this.servletPeriodPostPeriodDateFormats,
    this.servletPeriodPostPeriodNodeNameHints,
    this.servletPeriodPostPeriodNodeNameMaxLength,
    this.servletPeriodPostPeriodCheckinNewVersionableNodes,
    this.servletPeriodPostPeriodAutoCheckout,
    this.servletPeriodPostPeriodAutoCheckin,
    this.servletPeriodPostPeriodIgnorePattern,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? servletPeriodPostPeriodDateFormats;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? servletPeriodPostPeriodNodeNameHints;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? servletPeriodPostPeriodNodeNameMaxLength;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? servletPeriodPostPeriodCheckinNewVersionableNodes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? servletPeriodPostPeriodAutoCheckout;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? servletPeriodPostPeriodAutoCheckin;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? servletPeriodPostPeriodIgnorePattern;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingServletsPostImplSlingPostServletProperties &&
    other.servletPeriodPostPeriodDateFormats == servletPeriodPostPeriodDateFormats &&
    other.servletPeriodPostPeriodNodeNameHints == servletPeriodPostPeriodNodeNameHints &&
    other.servletPeriodPostPeriodNodeNameMaxLength == servletPeriodPostPeriodNodeNameMaxLength &&
    other.servletPeriodPostPeriodCheckinNewVersionableNodes == servletPeriodPostPeriodCheckinNewVersionableNodes &&
    other.servletPeriodPostPeriodAutoCheckout == servletPeriodPostPeriodAutoCheckout &&
    other.servletPeriodPostPeriodAutoCheckin == servletPeriodPostPeriodAutoCheckin &&
    other.servletPeriodPostPeriodIgnorePattern == servletPeriodPostPeriodIgnorePattern;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (servletPeriodPostPeriodDateFormats == null ? 0 : servletPeriodPostPeriodDateFormats!.hashCode) +
    (servletPeriodPostPeriodNodeNameHints == null ? 0 : servletPeriodPostPeriodNodeNameHints!.hashCode) +
    (servletPeriodPostPeriodNodeNameMaxLength == null ? 0 : servletPeriodPostPeriodNodeNameMaxLength!.hashCode) +
    (servletPeriodPostPeriodCheckinNewVersionableNodes == null ? 0 : servletPeriodPostPeriodCheckinNewVersionableNodes!.hashCode) +
    (servletPeriodPostPeriodAutoCheckout == null ? 0 : servletPeriodPostPeriodAutoCheckout!.hashCode) +
    (servletPeriodPostPeriodAutoCheckin == null ? 0 : servletPeriodPostPeriodAutoCheckin!.hashCode) +
    (servletPeriodPostPeriodIgnorePattern == null ? 0 : servletPeriodPostPeriodIgnorePattern!.hashCode);

  @override
  String toString() => 'OrgApacheSlingServletsPostImplSlingPostServletProperties[servletPeriodPostPeriodDateFormats=$servletPeriodPostPeriodDateFormats, servletPeriodPostPeriodNodeNameHints=$servletPeriodPostPeriodNodeNameHints, servletPeriodPostPeriodNodeNameMaxLength=$servletPeriodPostPeriodNodeNameMaxLength, servletPeriodPostPeriodCheckinNewVersionableNodes=$servletPeriodPostPeriodCheckinNewVersionableNodes, servletPeriodPostPeriodAutoCheckout=$servletPeriodPostPeriodAutoCheckout, servletPeriodPostPeriodAutoCheckin=$servletPeriodPostPeriodAutoCheckin, servletPeriodPostPeriodIgnorePattern=$servletPeriodPostPeriodIgnorePattern]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.servletPeriodPostPeriodDateFormats != null) {
      json[r'servlet.post.dateFormats'] = this.servletPeriodPostPeriodDateFormats;
    } else {
      json[r'servlet.post.dateFormats'] = null;
    }
    if (this.servletPeriodPostPeriodNodeNameHints != null) {
      json[r'servlet.post.nodeNameHints'] = this.servletPeriodPostPeriodNodeNameHints;
    } else {
      json[r'servlet.post.nodeNameHints'] = null;
    }
    if (this.servletPeriodPostPeriodNodeNameMaxLength != null) {
      json[r'servlet.post.nodeNameMaxLength'] = this.servletPeriodPostPeriodNodeNameMaxLength;
    } else {
      json[r'servlet.post.nodeNameMaxLength'] = null;
    }
    if (this.servletPeriodPostPeriodCheckinNewVersionableNodes != null) {
      json[r'servlet.post.checkinNewVersionableNodes'] = this.servletPeriodPostPeriodCheckinNewVersionableNodes;
    } else {
      json[r'servlet.post.checkinNewVersionableNodes'] = null;
    }
    if (this.servletPeriodPostPeriodAutoCheckout != null) {
      json[r'servlet.post.autoCheckout'] = this.servletPeriodPostPeriodAutoCheckout;
    } else {
      json[r'servlet.post.autoCheckout'] = null;
    }
    if (this.servletPeriodPostPeriodAutoCheckin != null) {
      json[r'servlet.post.autoCheckin'] = this.servletPeriodPostPeriodAutoCheckin;
    } else {
      json[r'servlet.post.autoCheckin'] = null;
    }
    if (this.servletPeriodPostPeriodIgnorePattern != null) {
      json[r'servlet.post.ignorePattern'] = this.servletPeriodPostPeriodIgnorePattern;
    } else {
      json[r'servlet.post.ignorePattern'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingServletsPostImplSlingPostServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingServletsPostImplSlingPostServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingServletsPostImplSlingPostServletProperties(
        servletPeriodPostPeriodDateFormats: ConfigNodePropertyArray.fromJson(json[r'servlet.post.dateFormats']),
        servletPeriodPostPeriodNodeNameHints: ConfigNodePropertyArray.fromJson(json[r'servlet.post.nodeNameHints']),
        servletPeriodPostPeriodNodeNameMaxLength: ConfigNodePropertyInteger.fromJson(json[r'servlet.post.nodeNameMaxLength']),
        servletPeriodPostPeriodCheckinNewVersionableNodes: ConfigNodePropertyBoolean.fromJson(json[r'servlet.post.checkinNewVersionableNodes']),
        servletPeriodPostPeriodAutoCheckout: ConfigNodePropertyBoolean.fromJson(json[r'servlet.post.autoCheckout']),
        servletPeriodPostPeriodAutoCheckin: ConfigNodePropertyBoolean.fromJson(json[r'servlet.post.autoCheckin']),
        servletPeriodPostPeriodIgnorePattern: ConfigNodePropertyString.fromJson(json[r'servlet.post.ignorePattern']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingServletsPostImplSlingPostServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingServletsPostImplSlingPostServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingServletsPostImplSlingPostServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingServletsPostImplSlingPostServletProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingServletsPostImplSlingPostServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingServletsPostImplSlingPostServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingServletsPostImplSlingPostServletProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingServletsPostImplSlingPostServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingServletsPostImplSlingPostServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingServletsPostImplSlingPostServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

