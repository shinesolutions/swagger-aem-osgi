//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_xss_impl_xss_filter_impl_properties.g.dart';

/// OrgApacheSlingXssImplXSSFilterImplProperties
///
/// Properties:
/// * [policyPath] 
@BuiltValue()
abstract class OrgApacheSlingXssImplXSSFilterImplProperties implements Built<OrgApacheSlingXssImplXSSFilterImplProperties, OrgApacheSlingXssImplXSSFilterImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'policyPath')
  ConfigNodePropertyString? get policyPath;

  OrgApacheSlingXssImplXSSFilterImplProperties._();

  factory OrgApacheSlingXssImplXSSFilterImplProperties([void updates(OrgApacheSlingXssImplXSSFilterImplPropertiesBuilder b)]) = _$OrgApacheSlingXssImplXSSFilterImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingXssImplXSSFilterImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingXssImplXSSFilterImplProperties> get serializer => _$OrgApacheSlingXssImplXSSFilterImplPropertiesSerializer();
}

class _$OrgApacheSlingXssImplXSSFilterImplPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingXssImplXSSFilterImplProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingXssImplXSSFilterImplProperties, _$OrgApacheSlingXssImplXSSFilterImplProperties];

  @override
  final String wireName = r'OrgApacheSlingXssImplXSSFilterImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingXssImplXSSFilterImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.policyPath != null) {
      yield r'policyPath';
      yield serializers.serialize(
        object.policyPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingXssImplXSSFilterImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingXssImplXSSFilterImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'policyPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.policyPath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingXssImplXSSFilterImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingXssImplXSSFilterImplPropertiesBuilder();
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

