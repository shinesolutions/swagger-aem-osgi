//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store_properties.g.dart';

/// OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties
///
/// Properties:
/// * [path] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties implements Built<OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties, OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesBuilder> {
  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties._();

  factory OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties([void updates(OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesBuilder b)]) = _$OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties> get serializer => _$OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesSerializer();
}

class _$OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties, _$OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.path.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesBuilder();
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

