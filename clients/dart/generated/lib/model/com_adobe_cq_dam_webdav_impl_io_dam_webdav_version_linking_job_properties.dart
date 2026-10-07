//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties {
  /// Returns a new [ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties] instance.
  ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties({
    this.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodEnable,
    this.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodSchedulerPeriodPeriod,
    this.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodStagingPeriodTimeout,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodEnable;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodSchedulerPeriodPeriod;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodStagingPeriodTimeout;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties &&
    other.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodEnable == cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodEnable &&
    other.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodSchedulerPeriodPeriod == cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodSchedulerPeriodPeriod &&
    other.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodStagingPeriodTimeout == cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodStagingPeriodTimeout;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodEnable == null ? 0 : cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodEnable!.hashCode) +
    (cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodSchedulerPeriodPeriod == null ? 0 : cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodSchedulerPeriodPeriod!.hashCode) +
    (cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodStagingPeriodTimeout == null ? 0 : cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodStagingPeriodTimeout!.hashCode);

  @override
  String toString() => 'ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties[cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodEnable=$cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodEnable, cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodSchedulerPeriodPeriod=$cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodSchedulerPeriodPeriod, cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodStagingPeriodTimeout=$cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodStagingPeriodTimeout]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodEnable != null) {
      json[r'cq.dam.webdav.version.linking.enable'] = this.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodEnable;
    } else {
      json[r'cq.dam.webdav.version.linking.enable'] = null;
    }
    if (this.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodSchedulerPeriodPeriod != null) {
      json[r'cq.dam.webdav.version.linking.scheduler.period'] = this.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodSchedulerPeriodPeriod;
    } else {
      json[r'cq.dam.webdav.version.linking.scheduler.period'] = null;
    }
    if (this.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodStagingPeriodTimeout != null) {
      json[r'cq.dam.webdav.version.linking.staging.timeout'] = this.cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodStagingPeriodTimeout;
    } else {
      json[r'cq.dam.webdav.version.linking.staging.timeout'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties(
        cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodEnable: ConfigNodePropertyBoolean.fromJson(json[r'cq.dam.webdav.version.linking.enable']),
        cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodSchedulerPeriodPeriod: ConfigNodePropertyInteger.fromJson(json[r'cq.dam.webdav.version.linking.scheduler.period']),
        cqPeriodDamPeriodWebdavPeriodVersionPeriodLinkingPeriodStagingPeriodTimeout: ConfigNodePropertyInteger.fromJson(json[r'cq.dam.webdav.version.linking.staging.timeout']),
      );
    }
    return null;
  }

  static List<ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

