//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_properties.g.dart';

/// ComAdobeCqScheduledExporterImplScheduledExporterImplProperties
///
/// Properties:
/// * [includePeriodPaths] 
/// * [exporterPeriodUser] 
@BuiltValue()
abstract class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties implements Built<ComAdobeCqScheduledExporterImplScheduledExporterImplProperties, ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'include.paths')
  ConfigNodePropertyArray? get includePeriodPaths;

  @BuiltValueField(wireName: r'exporter.user')
  ConfigNodePropertyString? get exporterPeriodUser;

  ComAdobeCqScheduledExporterImplScheduledExporterImplProperties._();

  factory ComAdobeCqScheduledExporterImplScheduledExporterImplProperties([void updates(ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesBuilder b)]) = _$ComAdobeCqScheduledExporterImplScheduledExporterImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqScheduledExporterImplScheduledExporterImplProperties> get serializer => _$ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesSerializer();
}

class _$ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqScheduledExporterImplScheduledExporterImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqScheduledExporterImplScheduledExporterImplProperties, _$ComAdobeCqScheduledExporterImplScheduledExporterImplProperties];

  @override
  final String wireName = r'ComAdobeCqScheduledExporterImplScheduledExporterImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqScheduledExporterImplScheduledExporterImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.includePeriodPaths != null) {
      yield r'include.paths';
      yield serializers.serialize(
        object.includePeriodPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.exporterPeriodUser != null) {
      yield r'exporter.user';
      yield serializers.serialize(
        object.exporterPeriodUser,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqScheduledExporterImplScheduledExporterImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'include.paths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.includePeriodPaths.replace(valueDes);
          break;
        case r'exporter.user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.exporterPeriodUser.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqScheduledExporterImplScheduledExporterImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqScheduledExporterImplScheduledExporterImplPropertiesBuilder();
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

