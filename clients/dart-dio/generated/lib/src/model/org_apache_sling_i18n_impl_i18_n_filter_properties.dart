//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_i18n_impl_i18_n_filter_properties.g.dart';

/// OrgApacheSlingI18nImplI18NFilterProperties
///
/// Properties:
/// * [servicePeriodRanking] 
/// * [slingPeriodFilterPeriodScope] 
@BuiltValue()
abstract class OrgApacheSlingI18nImplI18NFilterProperties implements Built<OrgApacheSlingI18nImplI18NFilterProperties, OrgApacheSlingI18nImplI18NFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'service.ranking')
  ConfigNodePropertyInteger? get servicePeriodRanking;

  @BuiltValueField(wireName: r'sling.filter.scope')
  ConfigNodePropertyArray? get slingPeriodFilterPeriodScope;

  OrgApacheSlingI18nImplI18NFilterProperties._();

  factory OrgApacheSlingI18nImplI18NFilterProperties([void updates(OrgApacheSlingI18nImplI18NFilterPropertiesBuilder b)]) = _$OrgApacheSlingI18nImplI18NFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingI18nImplI18NFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingI18nImplI18NFilterProperties> get serializer => _$OrgApacheSlingI18nImplI18NFilterPropertiesSerializer();
}

class _$OrgApacheSlingI18nImplI18NFilterPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingI18nImplI18NFilterProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingI18nImplI18NFilterProperties, _$OrgApacheSlingI18nImplI18NFilterProperties];

  @override
  final String wireName = r'OrgApacheSlingI18nImplI18NFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingI18nImplI18NFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.servicePeriodRanking != null) {
      yield r'service.ranking';
      yield serializers.serialize(
        object.servicePeriodRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.slingPeriodFilterPeriodScope != null) {
      yield r'sling.filter.scope';
      yield serializers.serialize(
        object.slingPeriodFilterPeriodScope,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingI18nImplI18NFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingI18nImplI18NFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'service.ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.servicePeriodRanking.replace(valueDes);
          break;
        case r'sling.filter.scope':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.slingPeriodFilterPeriodScope.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingI18nImplI18NFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingI18nImplI18NFilterPropertiesBuilder();
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

