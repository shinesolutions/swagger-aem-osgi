//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_widget_impl_widget_extension_provider_impl_properties.g.dart';

/// ComDayCqWidgetImplWidgetExtensionProviderImplProperties
///
/// Properties:
/// * [extendablePeriodWidgets] 
/// * [widgetextensionproviderPeriodDebug] 
@BuiltValue()
abstract class ComDayCqWidgetImplWidgetExtensionProviderImplProperties implements Built<ComDayCqWidgetImplWidgetExtensionProviderImplProperties, ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'extendable.widgets')
  ConfigNodePropertyArray? get extendablePeriodWidgets;

  @BuiltValueField(wireName: r'widgetextensionprovider.debug')
  ConfigNodePropertyBoolean? get widgetextensionproviderPeriodDebug;

  ComDayCqWidgetImplWidgetExtensionProviderImplProperties._();

  factory ComDayCqWidgetImplWidgetExtensionProviderImplProperties([void updates(ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesBuilder b)]) = _$ComDayCqWidgetImplWidgetExtensionProviderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWidgetImplWidgetExtensionProviderImplProperties> get serializer => _$ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesSerializer();
}

class _$ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWidgetImplWidgetExtensionProviderImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWidgetImplWidgetExtensionProviderImplProperties, _$ComDayCqWidgetImplWidgetExtensionProviderImplProperties];

  @override
  final String wireName = r'ComDayCqWidgetImplWidgetExtensionProviderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWidgetImplWidgetExtensionProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.extendablePeriodWidgets != null) {
      yield r'extendable.widgets';
      yield serializers.serialize(
        object.extendablePeriodWidgets,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.widgetextensionproviderPeriodDebug != null) {
      yield r'widgetextensionprovider.debug';
      yield serializers.serialize(
        object.widgetextensionproviderPeriodDebug,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWidgetImplWidgetExtensionProviderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'extendable.widgets':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.extendablePeriodWidgets.replace(valueDes);
          break;
        case r'widgetextensionprovider.debug':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.widgetextensionproviderPeriodDebug.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWidgetImplWidgetExtensionProviderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesBuilder();
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

