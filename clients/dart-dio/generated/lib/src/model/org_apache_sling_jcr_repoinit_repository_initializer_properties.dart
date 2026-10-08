//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_jcr_repoinit_repository_initializer_properties.g.dart';

/// OrgApacheSlingJcrRepoinitRepositoryInitializerProperties
///
/// Properties:
/// * [references] 
/// * [scripts] 
@BuiltValue()
abstract class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties implements Built<OrgApacheSlingJcrRepoinitRepositoryInitializerProperties, OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesBuilder> {
  @BuiltValueField(wireName: r'references')
  ConfigNodePropertyArray? get references;

  @BuiltValueField(wireName: r'scripts')
  ConfigNodePropertyArray? get scripts;

  OrgApacheSlingJcrRepoinitRepositoryInitializerProperties._();

  factory OrgApacheSlingJcrRepoinitRepositoryInitializerProperties([void updates(OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesBuilder b)]) = _$OrgApacheSlingJcrRepoinitRepositoryInitializerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingJcrRepoinitRepositoryInitializerProperties> get serializer => _$OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesSerializer();
}

class _$OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingJcrRepoinitRepositoryInitializerProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingJcrRepoinitRepositoryInitializerProperties, _$OrgApacheSlingJcrRepoinitRepositoryInitializerProperties];

  @override
  final String wireName = r'OrgApacheSlingJcrRepoinitRepositoryInitializerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingJcrRepoinitRepositoryInitializerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.references != null) {
      yield r'references';
      yield serializers.serialize(
        object.references,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.scripts != null) {
      yield r'scripts';
      yield serializers.serialize(
        object.scripts,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingJcrRepoinitRepositoryInitializerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesBuilder result,
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
        case r'scripts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.scripts.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingJcrRepoinitRepositoryInitializerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesBuilder();
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

