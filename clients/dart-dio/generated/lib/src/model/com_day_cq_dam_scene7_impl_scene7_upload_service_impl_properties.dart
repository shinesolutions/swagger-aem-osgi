//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_scene7_impl_scene7_upload_service_impl_properties.g.dart';

/// ComDayCqDamScene7ImplScene7UploadServiceImplProperties
///
/// Properties:
/// * [cqPeriodDamPeriodScene7PeriodUploadservicePeriodActivejobtimeoutPeriodLabel] 
/// * [cqPeriodDamPeriodScene7PeriodUploadservicePeriodConnectionmaxperroutePeriodLabel] 
@BuiltValue()
abstract class ComDayCqDamScene7ImplScene7UploadServiceImplProperties implements Built<ComDayCqDamScene7ImplScene7UploadServiceImplProperties, ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.dam.scene7.uploadservice.activejobtimeout.label')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodScene7PeriodUploadservicePeriodActivejobtimeoutPeriodLabel;

  @BuiltValueField(wireName: r'cq.dam.scene7.uploadservice.connectionmaxperroute.label')
  ConfigNodePropertyInteger? get cqPeriodDamPeriodScene7PeriodUploadservicePeriodConnectionmaxperroutePeriodLabel;

  ComDayCqDamScene7ImplScene7UploadServiceImplProperties._();

  factory ComDayCqDamScene7ImplScene7UploadServiceImplProperties([void updates(ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesBuilder b)]) = _$ComDayCqDamScene7ImplScene7UploadServiceImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamScene7ImplScene7UploadServiceImplProperties> get serializer => _$ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesSerializer();
}

class _$ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamScene7ImplScene7UploadServiceImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamScene7ImplScene7UploadServiceImplProperties, _$ComDayCqDamScene7ImplScene7UploadServiceImplProperties];

  @override
  final String wireName = r'ComDayCqDamScene7ImplScene7UploadServiceImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamScene7ImplScene7UploadServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodDamPeriodScene7PeriodUploadservicePeriodActivejobtimeoutPeriodLabel != null) {
      yield r'cq.dam.scene7.uploadservice.activejobtimeout.label';
      yield serializers.serialize(
        object.cqPeriodDamPeriodScene7PeriodUploadservicePeriodActivejobtimeoutPeriodLabel,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodDamPeriodScene7PeriodUploadservicePeriodConnectionmaxperroutePeriodLabel != null) {
      yield r'cq.dam.scene7.uploadservice.connectionmaxperroute.label';
      yield serializers.serialize(
        object.cqPeriodDamPeriodScene7PeriodUploadservicePeriodConnectionmaxperroutePeriodLabel,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamScene7ImplScene7UploadServiceImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.dam.scene7.uploadservice.activejobtimeout.label':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodScene7PeriodUploadservicePeriodActivejobtimeoutPeriodLabel.replace(valueDes);
          break;
        case r'cq.dam.scene7.uploadservice.connectionmaxperroute.label':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodDamPeriodScene7PeriodUploadservicePeriodConnectionmaxperroutePeriodLabel.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamScene7ImplScene7UploadServiceImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamScene7ImplScene7UploadServiceImplPropertiesBuilder();
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

