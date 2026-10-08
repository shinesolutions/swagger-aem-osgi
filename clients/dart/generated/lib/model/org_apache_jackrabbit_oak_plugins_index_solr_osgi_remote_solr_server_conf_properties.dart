//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties {
  /// Returns a new [OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties] instance.
  OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties({
    this.solrPeriodHttpPeriodUrl,
    this.solrPeriodZkPeriodHost,
    this.solrPeriodCollection,
    this.solrPeriodSocketPeriodTimeout,
    this.solrPeriodConnectionPeriodTimeout,
    this.solrPeriodShardsPeriodNo,
    this.solrPeriodReplicationPeriodFactor,
    this.solrPeriodConfPeriodDir,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? solrPeriodHttpPeriodUrl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? solrPeriodZkPeriodHost;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? solrPeriodCollection;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? solrPeriodSocketPeriodTimeout;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? solrPeriodConnectionPeriodTimeout;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? solrPeriodShardsPeriodNo;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? solrPeriodReplicationPeriodFactor;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? solrPeriodConfPeriodDir;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties &&
    other.solrPeriodHttpPeriodUrl == solrPeriodHttpPeriodUrl &&
    other.solrPeriodZkPeriodHost == solrPeriodZkPeriodHost &&
    other.solrPeriodCollection == solrPeriodCollection &&
    other.solrPeriodSocketPeriodTimeout == solrPeriodSocketPeriodTimeout &&
    other.solrPeriodConnectionPeriodTimeout == solrPeriodConnectionPeriodTimeout &&
    other.solrPeriodShardsPeriodNo == solrPeriodShardsPeriodNo &&
    other.solrPeriodReplicationPeriodFactor == solrPeriodReplicationPeriodFactor &&
    other.solrPeriodConfPeriodDir == solrPeriodConfPeriodDir;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (solrPeriodHttpPeriodUrl == null ? 0 : solrPeriodHttpPeriodUrl!.hashCode) +
    (solrPeriodZkPeriodHost == null ? 0 : solrPeriodZkPeriodHost!.hashCode) +
    (solrPeriodCollection == null ? 0 : solrPeriodCollection!.hashCode) +
    (solrPeriodSocketPeriodTimeout == null ? 0 : solrPeriodSocketPeriodTimeout!.hashCode) +
    (solrPeriodConnectionPeriodTimeout == null ? 0 : solrPeriodConnectionPeriodTimeout!.hashCode) +
    (solrPeriodShardsPeriodNo == null ? 0 : solrPeriodShardsPeriodNo!.hashCode) +
    (solrPeriodReplicationPeriodFactor == null ? 0 : solrPeriodReplicationPeriodFactor!.hashCode) +
    (solrPeriodConfPeriodDir == null ? 0 : solrPeriodConfPeriodDir!.hashCode);

  @override
  String toString() => 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties[solrPeriodHttpPeriodUrl=$solrPeriodHttpPeriodUrl, solrPeriodZkPeriodHost=$solrPeriodZkPeriodHost, solrPeriodCollection=$solrPeriodCollection, solrPeriodSocketPeriodTimeout=$solrPeriodSocketPeriodTimeout, solrPeriodConnectionPeriodTimeout=$solrPeriodConnectionPeriodTimeout, solrPeriodShardsPeriodNo=$solrPeriodShardsPeriodNo, solrPeriodReplicationPeriodFactor=$solrPeriodReplicationPeriodFactor, solrPeriodConfPeriodDir=$solrPeriodConfPeriodDir]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.solrPeriodHttpPeriodUrl != null) {
      json[r'solr.http.url'] = this.solrPeriodHttpPeriodUrl;
    } else {
      json[r'solr.http.url'] = null;
    }
    if (this.solrPeriodZkPeriodHost != null) {
      json[r'solr.zk.host'] = this.solrPeriodZkPeriodHost;
    } else {
      json[r'solr.zk.host'] = null;
    }
    if (this.solrPeriodCollection != null) {
      json[r'solr.collection'] = this.solrPeriodCollection;
    } else {
      json[r'solr.collection'] = null;
    }
    if (this.solrPeriodSocketPeriodTimeout != null) {
      json[r'solr.socket.timeout'] = this.solrPeriodSocketPeriodTimeout;
    } else {
      json[r'solr.socket.timeout'] = null;
    }
    if (this.solrPeriodConnectionPeriodTimeout != null) {
      json[r'solr.connection.timeout'] = this.solrPeriodConnectionPeriodTimeout;
    } else {
      json[r'solr.connection.timeout'] = null;
    }
    if (this.solrPeriodShardsPeriodNo != null) {
      json[r'solr.shards.no'] = this.solrPeriodShardsPeriodNo;
    } else {
      json[r'solr.shards.no'] = null;
    }
    if (this.solrPeriodReplicationPeriodFactor != null) {
      json[r'solr.replication.factor'] = this.solrPeriodReplicationPeriodFactor;
    } else {
      json[r'solr.replication.factor'] = null;
    }
    if (this.solrPeriodConfPeriodDir != null) {
      json[r'solr.conf.dir'] = this.solrPeriodConfPeriodDir;
    } else {
      json[r'solr.conf.dir'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties(
        solrPeriodHttpPeriodUrl: ConfigNodePropertyString.fromJson(json[r'solr.http.url']),
        solrPeriodZkPeriodHost: ConfigNodePropertyString.fromJson(json[r'solr.zk.host']),
        solrPeriodCollection: ConfigNodePropertyString.fromJson(json[r'solr.collection']),
        solrPeriodSocketPeriodTimeout: ConfigNodePropertyInteger.fromJson(json[r'solr.socket.timeout']),
        solrPeriodConnectionPeriodTimeout: ConfigNodePropertyInteger.fromJson(json[r'solr.connection.timeout']),
        solrPeriodShardsPeriodNo: ConfigNodePropertyInteger.fromJson(json[r'solr.shards.no']),
        solrPeriodReplicationPeriodFactor: ConfigNodePropertyInteger.fromJson(json[r'solr.replication.factor']),
        solrPeriodConfPeriodDir: ConfigNodePropertyString.fromJson(json[r'solr.conf.dir']),
      );
    }
    return null;
  }

  static List<OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties-objects as value to a dart map
  static Map<String, List<OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

