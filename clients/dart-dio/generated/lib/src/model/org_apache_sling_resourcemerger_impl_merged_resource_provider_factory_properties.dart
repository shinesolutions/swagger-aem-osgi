//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_resourcemerger_impl_merged_resource_provider_factory_properties.g.dart';

/// OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties
///
/// Properties:
/// * [mergePeriodRoot] 
/// * [mergePeriodReadOnly] 
@BuiltValue()
abstract class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties implements Built<OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties, OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'merge.root')
  ConfigNodePropertyString? get mergePeriodRoot;

  @BuiltValueField(wireName: r'merge.readOnly')
  ConfigNodePropertyBoolean? get mergePeriodReadOnly;

  OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties._();

  factory OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties([void updates(OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesBuilder b)]) = _$OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties> get serializer => _$OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesSerializer();
}

class _$OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties, _$OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties];

  @override
  final String wireName = r'OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.mergePeriodRoot != null) {
      yield r'merge.root';
      yield serializers.serialize(
        object.mergePeriodRoot,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.mergePeriodReadOnly != null) {
      yield r'merge.readOnly';
      yield serializers.serialize(
        object.mergePeriodReadOnly,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'merge.root':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.mergePeriodRoot.replace(valueDes);
          break;
        case r'merge.readOnly':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.mergePeriodReadOnly.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesBuilder();
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

