//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_properties.g.dart';

/// ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties
///
/// Properties:
/// * [processPeriodLabel] 
/// * [extractPeriodPages] 
@BuiltValue()
abstract class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties implements Built<ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties, ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesBuilder> {
  @BuiltValueField(wireName: r'process.label')
  ConfigNodePropertyString? get processPeriodLabel;

  @BuiltValueField(wireName: r'extract.pages')
  ConfigNodePropertyBoolean? get extractPeriodPages;

  ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties._();

  factory ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties([void updates(ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesBuilder b)]) = _$ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties> get serializer => _$ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesSerializer();
}

class _$ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties, _$ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties];

  @override
  final String wireName = r'ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.processPeriodLabel != null) {
      yield r'process.label';
      yield serializers.serialize(
        object.processPeriodLabel,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.extractPeriodPages != null) {
      yield r'extract.pages';
      yield serializers.serialize(
        object.extractPeriodPages,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'process.label':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.processPeriodLabel.replace(valueDes);
          break;
        case r'extract.pages':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.extractPeriodPages.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesBuilder();
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

