//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties.g.dart';

/// OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties
///
/// Properties:
/// * [dir] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties implements Built<OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties, OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'dir')
  ConfigNodePropertyString? get dir;

  OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties._();

  factory OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties([void updates(OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties> get serializer => _$OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties, _$OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.dir != null) {
      yield r'dir';
      yield serializers.serialize(
        object.dir,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'dir':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.dir.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesBuilder();
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

