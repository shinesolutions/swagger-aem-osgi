//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_csrf_impl_csrf_filter_properties.g.dart';

/// ComAdobeGraniteCsrfImplCSRFFilterProperties
///
/// Properties:
/// * [filterPeriodMethods] 
/// * [filterPeriodEnablePeriodSafePeriodUserPeriodAgents] 
/// * [filterPeriodSafePeriodUserPeriodAgents] 
/// * [filterPeriodExcludedPeriodPaths] 
@BuiltValue()
abstract class ComAdobeGraniteCsrfImplCSRFFilterProperties implements Built<ComAdobeGraniteCsrfImplCSRFFilterProperties, ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder> {
  @BuiltValueField(wireName: r'filter.methods')
  ConfigNodePropertyArray? get filterPeriodMethods;

  @BuiltValueField(wireName: r'filter.enable.safe.user.agents')
  ConfigNodePropertyBoolean? get filterPeriodEnablePeriodSafePeriodUserPeriodAgents;

  @BuiltValueField(wireName: r'filter.safe.user.agents')
  ConfigNodePropertyArray? get filterPeriodSafePeriodUserPeriodAgents;

  @BuiltValueField(wireName: r'filter.excluded.paths')
  ConfigNodePropertyArray? get filterPeriodExcludedPeriodPaths;

  ComAdobeGraniteCsrfImplCSRFFilterProperties._();

  factory ComAdobeGraniteCsrfImplCSRFFilterProperties([void updates(ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder b)]) = _$ComAdobeGraniteCsrfImplCSRFFilterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteCsrfImplCSRFFilterProperties> get serializer => _$ComAdobeGraniteCsrfImplCSRFFilterPropertiesSerializer();
}

class _$ComAdobeGraniteCsrfImplCSRFFilterPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteCsrfImplCSRFFilterProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteCsrfImplCSRFFilterProperties, _$ComAdobeGraniteCsrfImplCSRFFilterProperties];

  @override
  final String wireName = r'ComAdobeGraniteCsrfImplCSRFFilterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteCsrfImplCSRFFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.filterPeriodMethods != null) {
      yield r'filter.methods';
      yield serializers.serialize(
        object.filterPeriodMethods,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.filterPeriodEnablePeriodSafePeriodUserPeriodAgents != null) {
      yield r'filter.enable.safe.user.agents';
      yield serializers.serialize(
        object.filterPeriodEnablePeriodSafePeriodUserPeriodAgents,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.filterPeriodSafePeriodUserPeriodAgents != null) {
      yield r'filter.safe.user.agents';
      yield serializers.serialize(
        object.filterPeriodSafePeriodUserPeriodAgents,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.filterPeriodExcludedPeriodPaths != null) {
      yield r'filter.excluded.paths';
      yield serializers.serialize(
        object.filterPeriodExcludedPeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteCsrfImplCSRFFilterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'filter.methods':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.filterPeriodMethods.replace(valueDes);
          break;
        case r'filter.enable.safe.user.agents':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.filterPeriodEnablePeriodSafePeriodUserPeriodAgents.replace(valueDes);
          break;
        case r'filter.safe.user.agents':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.filterPeriodSafePeriodUserPeriodAgents.replace(valueDes);
          break;
        case r'filter.excluded.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.filterPeriodExcludedPeriodPaths.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteCsrfImplCSRFFilterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteCsrfImplCSRFFilterPropertiesBuilder();
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

