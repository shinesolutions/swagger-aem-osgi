//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_info.g.dart';

/// OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo
///
/// Properties:
/// * [pid] 
/// * [title] 
/// * [description] 
/// * [properties] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo implements Built<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo, OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder> {
  @BuiltValueField(wireName: r'pid')
  String? get pid;

  @BuiltValueField(wireName: r'title')
  String? get title;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'properties')
  OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties? get properties;

  OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo._();

  factory OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo([void updates(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder b)]) = _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo> get serializer => _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoSerializer();
}

class _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo, _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pid != null) {
      yield r'pid';
      yield serializers.serialize(
        object.pid,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pid = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties),
          ) as OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties?;
          if (valueDes == null) continue;
          result.properties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

