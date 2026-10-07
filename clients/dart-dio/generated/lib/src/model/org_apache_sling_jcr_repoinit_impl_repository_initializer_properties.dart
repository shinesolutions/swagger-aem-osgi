//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_jcr_repoinit_impl_repository_initializer_properties.g.dart';

/// OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties
///
/// Properties:
/// * [references] 
@BuiltValue()
abstract class OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties implements Built<OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties, OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesBuilder> {
  @BuiltValueField(wireName: r'references')
  ConfigNodePropertyArray? get references;

  OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties._();

  factory OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties([void updates(OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesBuilder b)]) = _$OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties> get serializer => _$OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesSerializer();
}

class _$OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties, _$OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties];

  @override
  final String wireName = r'OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.references != null) {
      yield r'references';
      yield serializers.serialize(
        object.references,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'references':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.references.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesBuilder();
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

