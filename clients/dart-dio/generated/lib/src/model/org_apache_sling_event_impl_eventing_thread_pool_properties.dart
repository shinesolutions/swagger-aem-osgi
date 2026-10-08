//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_event_impl_eventing_thread_pool_properties.g.dart';

/// OrgApacheSlingEventImplEventingThreadPoolProperties
///
/// Properties:
/// * [minPoolSize] 
@BuiltValue()
abstract class OrgApacheSlingEventImplEventingThreadPoolProperties implements Built<OrgApacheSlingEventImplEventingThreadPoolProperties, OrgApacheSlingEventImplEventingThreadPoolPropertiesBuilder> {
  @BuiltValueField(wireName: r'minPoolSize')
  ConfigNodePropertyInteger? get minPoolSize;

  OrgApacheSlingEventImplEventingThreadPoolProperties._();

  factory OrgApacheSlingEventImplEventingThreadPoolProperties([void updates(OrgApacheSlingEventImplEventingThreadPoolPropertiesBuilder b)]) = _$OrgApacheSlingEventImplEventingThreadPoolProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingEventImplEventingThreadPoolPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingEventImplEventingThreadPoolProperties> get serializer => _$OrgApacheSlingEventImplEventingThreadPoolPropertiesSerializer();
}

class _$OrgApacheSlingEventImplEventingThreadPoolPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingEventImplEventingThreadPoolProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingEventImplEventingThreadPoolProperties, _$OrgApacheSlingEventImplEventingThreadPoolProperties];

  @override
  final String wireName = r'OrgApacheSlingEventImplEventingThreadPoolProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingEventImplEventingThreadPoolProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.minPoolSize != null) {
      yield r'minPoolSize';
      yield serializers.serialize(
        object.minPoolSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingEventImplEventingThreadPoolProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingEventImplEventingThreadPoolPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'minPoolSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.minPoolSize.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingEventImplEventingThreadPoolProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingEventImplEventingThreadPoolPropertiesBuilder();
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

