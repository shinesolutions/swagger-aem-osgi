//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties.g.dart';

/// OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties
///
/// Properties:
/// * [serverPeriodType] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties implements Built<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties, OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesBuilder> {
  @BuiltValueField(wireName: r'server.type')
  ConfigNodePropertyDropDown? get serverPeriodType;

  OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties._();

  factory OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties([void updates(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesBuilder b)]) = _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties> get serializer => _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesSerializer();
}

class _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties, _$OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.serverPeriodType != null) {
      yield r'server.type';
      yield serializers.serialize(
        object.serverPeriodType,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'server.type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.serverPeriodType.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesBuilder();
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

