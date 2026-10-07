//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_servlets_get_impl_version_version_info_servlet_properties.g.dart';

/// OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties
///
/// Properties:
/// * [slingPeriodServletPeriodSelectors] 
/// * [ecmaSuport] 
@BuiltValue()
abstract class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties implements Built<OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties, OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesBuilder> {
  @BuiltValueField(wireName: r'sling.servlet.selectors')
  ConfigNodePropertyArray? get slingPeriodServletPeriodSelectors;

  @BuiltValueField(wireName: r'ecmaSuport')
  ConfigNodePropertyBoolean? get ecmaSuport;

  OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties._();

  factory OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties([void updates(OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesBuilder b)]) = _$OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties> get serializer => _$OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesSerializer();
}

class _$OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties, _$OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties];

  @override
  final String wireName = r'OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.slingPeriodServletPeriodSelectors != null) {
      yield r'sling.servlet.selectors';
      yield serializers.serialize(
        object.slingPeriodServletPeriodSelectors,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.ecmaSuport != null) {
      yield r'ecmaSuport';
      yield serializers.serialize(
        object.ecmaSuport,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'sling.servlet.selectors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.slingPeriodServletPeriodSelectors.replace(valueDes);
          break;
        case r'ecmaSuport':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.ecmaSuport.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesBuilder();
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

