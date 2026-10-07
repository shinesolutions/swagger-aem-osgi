//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_activitystreams_impl_activity_manager_impl_properties.g.dart';

/// ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties
///
/// Properties:
/// * [aggregatePeriodRelationships] 
/// * [aggregatePeriodDescendPeriodVirtual] 
@BuiltValue()
abstract class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties implements Built<ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties, ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'aggregate.relationships')
  ConfigNodePropertyArray? get aggregatePeriodRelationships;

  @BuiltValueField(wireName: r'aggregate.descend.virtual')
  ConfigNodePropertyBoolean? get aggregatePeriodDescendPeriodVirtual;

  ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties._();

  factory ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties([void updates(ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesBuilder b)]) = _$ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties> get serializer => _$ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesSerializer();
}

class _$ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties, _$ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties];

  @override
  final String wireName = r'ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.aggregatePeriodRelationships != null) {
      yield r'aggregate.relationships';
      yield serializers.serialize(
        object.aggregatePeriodRelationships,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.aggregatePeriodDescendPeriodVirtual != null) {
      yield r'aggregate.descend.virtual';
      yield serializers.serialize(
        object.aggregatePeriodDescendPeriodVirtual,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'aggregate.relationships':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.aggregatePeriodRelationships.replace(valueDes);
          break;
        case r'aggregate.descend.virtual':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.aggregatePeriodDescendPeriodVirtual.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesBuilder();
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

