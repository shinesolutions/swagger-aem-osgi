//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_scene7_impl_scene7_api_client_impl_properties.g.dart';

/// ComDayCqDamScene7ImplScene7APIClientImplProperties
///
/// Properties:
/// * [cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodNofilterPeriodName] 
/// * [cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodWithfilterPeriodName] 
@BuiltValue()
abstract class ComDayCqDamScene7ImplScene7APIClientImplProperties implements Built<ComDayCqDamScene7ImplScene7APIClientImplProperties, ComDayCqDamScene7ImplScene7APIClientImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.scene7.apiclient.recordsperpage.nofilter.name')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodNofilterPeriodName;

  @BuiltValueField(wireName: r'cq.dam.scene7.apiclient.recordsperpage.withfilter.name')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodWithfilterPeriodName;

  ComDayCqDamScene7ImplScene7APIClientImplProperties._();

  factory ComDayCqDamScene7ImplScene7APIClientImplProperties([void updates(ComDayCqDamScene7ImplScene7APIClientImplPropertiesBuilder b)]) = _$ComDayCqDamScene7ImplScene7APIClientImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamScene7ImplScene7APIClientImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamScene7ImplScene7APIClientImplProperties> get serializer => _$ComDayCqDamScene7ImplScene7APIClientImplPropertiesSerializer();
}

class _$ComDayCqDamScene7ImplScene7APIClientImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamScene7ImplScene7APIClientImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamScene7ImplScene7APIClientImplProperties, _$ComDayCqDamScene7ImplScene7APIClientImplProperties];

  @override
  final String wireName = r'ComDayCqDamScene7ImplScene7APIClientImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamScene7ImplScene7APIClientImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodNofilterPeriodName != null) {
      yield r'cq.dam.scene7.apiclient.recordsperpage.nofilter.name';
      yield serializers.serialize(
        object.cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodNofilterPeriodName,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodWithfilterPeriodName != null) {
      yield r'cq.dam.scene7.apiclient.recordsperpage.withfilter.name';
      yield serializers.serialize(
        object.cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodWithfilterPeriodName,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamScene7ImplScene7APIClientImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamScene7ImplScene7APIClientImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.scene7.apiclient.recordsperpage.nofilter.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodNofilterPeriodName.replace(valueDes);
          break;
        case r'cq.dam.scene7.apiclient.recordsperpage.withfilter.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodScene7PeriodApiclientPeriodRecordsperpagePeriodWithfilterPeriodName.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamScene7ImplScene7APIClientImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamScene7ImplScene7APIClientImplPropertiesBuilder();
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

